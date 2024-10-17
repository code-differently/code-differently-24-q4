import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem, Role } from '../models/index.js';
import { Loader } from './loader.js';

export class XavierCruzLoader implements Loader {
  getLoaderName(): string {
    return 'xaviercruz';
  }

  async loadData(): Promise<MediaItem[]> {
    const credits = await this.loadCredits();
    const mediaItems = await this.loadMediaItems();

    console.log(
      `Loaded ${credits.length} credits and ${mediaItems.length} media items`,
    );

    credits.forEach((credit) => {
      const mediaItem = mediaItems.find(
        (media) => media.getId() === credit.getMediaItemId(),
      );

      if (mediaItem) {
        mediaItem.addCredit(credit);
      }
    });

    return [...mediaItems.values()];
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    const mediaItems = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());

    for await (const row of readable) {
      const { id, type, title, year } = row;
      mediaItems.push(new MediaItem(id, title, type, year, []));
    }

    return mediaItems;
  }

  async loadCredits(): Promise<Credit[]> {
    const filePath = 'data/credits.csv';
    const fileContents = fs.readFileSync(filePath, 'utf-8');

    const lines = fileContents.split('\n');
    const contentByLine = lines.slice(1);

    for (let i = 0; i < contentByLine.length; i++) {
      contentByLine[i] = contentByLine[i].substring(
        contentByLine[i].indexOf(',') + 1,
      );
    }

    // help from ChatGPT - Fixing the roleStr as Role issue
    const credits: Credit[] = contentByLine.map((credit) => {
      const [mediaItemId, roleStr, name] = credit.split(',');

      // cast roleStr to Role type
      const role: Role = roleStr as Role;

      return new Credit(mediaItemId, name, role);
    });

    return credits;
  }
}

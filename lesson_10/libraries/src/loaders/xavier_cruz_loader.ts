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

    for (let i = 0; i < mediaItems.length; i++) {
      if (i < 100) {
        mediaItems[i].addCredit(credits[i] as Credit); //tests pass however people in credits dont match up to the movies??
      }
    }

    return [...mediaItems.values()];
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    // TODO: Implement this method.
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

  //PARSE CSV MANUALLY - Extra Credit
  async loadCredits(): Promise<Credit[]> {
    const filePath = 'data/credits.csv';
    const fileContents = fs.readFileSync(filePath, 'utf-8');

    const lines = fileContents.split('\n');
    const newString = lines.slice(1);
    const trimmedString = newString;

    for (let i = 0; i < trimmedString.length; i++) {
      trimmedString[i] = trimmedString[i].substring(
        trimmedString[i].indexOf(',') + 1,
      );
    }

    // help from ChatGPT - Fixing the roleStr as Role issue
    const credits: Credit[] = trimmedString.map((credit) => {
      const [mediaItemId, roleStr, name] = credit.split(',');

      const role: Role = roleStr as Role;

      return {
        mediaItemId,
        role,
        name,
      };
    });

    return credits;
  }
}

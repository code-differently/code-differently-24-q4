import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class KimberleeHaldaneLoader implements Loader {
  getLoaderName(): string {
    return 'kimberleehaldane';
  }

  async loadData(): Promise<MediaItem[]> {
    const credits = await this.loadCredits();
    const mediaItems = await this.loadMediaItems();

    console.log(
      `Loaded ${credits.length} credits and ${mediaItems.length} media items`,
    );

    return [...mediaItems.values()];
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    const mediaItems = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());

    fs.createReadStream('data/media_items.csv', 'utf-8').pipe(csv());
    for await (const row of readable) {
      const { id, type, title, year } = row;
      // Xavier helped me with line 33. I couldn't figure out why
      // MediaItems was asking for things not listed on the media items list.
      mediaItems.push(new MediaItem(id, title, type, year, []));
    }

    return mediaItems;
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { media_item_id, role, name } = row;
      credits.push(new Credit(media_item_id, name, role));
    }
    return credits;
  }
}

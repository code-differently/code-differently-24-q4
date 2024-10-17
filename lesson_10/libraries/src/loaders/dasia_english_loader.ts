import csv from 'csv-parser';
import fs from 'fs';

import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class DasiaEnglishLoader implements Loader {
  getLoaderName(): string {
    return 'dasiaenglish';
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
    const media = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { id, type, title, year } = row;
      media.push(new MediaItem(id, title, type, year, []));
    }
    return media;

    // I used this youtube video to help me understand the above code: https://www.youtube.com/watch?v=bbvECy0ICuo
    // I also got help from Lj on getting my test to run correctly
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { media_item_id: mediaItemId, role, name } = row;
      credits.push(new Credit(mediaItemId, name, role));
    }
    return credits;
  }
}

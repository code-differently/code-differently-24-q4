import csv from 'csv-parser';
import fs from 'fs';

import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class DasiaEnglishLoader implements Loader {
  getLoaderName(): string {
    return 'anthonymays';
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
    const matches = fs
      .readFileSync('data/media_items.csv', {
        encoding: 'utf-8',    
      })
      .split('\n')
      .map((row: string): string[] => {
        return row.split(',');
      });
    console.log(matches);
    // I used this youtube video to help me understand the above code: https://www.youtube.com/watch?v=bbvECy0ICuo
    return [];
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { media_item_id: mediaItemId, role, name } = row;
      credits.push({ mediaItemId, name, role });
    }
    return credits;
  }
}

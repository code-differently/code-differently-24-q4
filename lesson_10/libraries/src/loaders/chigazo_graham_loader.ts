import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class ChigazoGrahamLoader implements Loader {
  getLoaderName(): string {
    return 'chigazograham';
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
    // TODO: Implement this method.
    const mediaItems = [];
    const readable = fs.readFileSync('data/media_items.csv', {
        encoding: 'utf-8'
    })
    .split('\n')
    .map((row: string): string[] => {
        return row.split(',');
    }
);
    for await (const row of readable) {
      const { id, type, title, genre, year } = row;
      mediaItems.push(new MediaItem(id, type, title, genre, year));
    }
    return mediaItems;
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { id, media_item_id, role, name } = row;
      credits.push(new Credit( id, media_item_id, name, role));
    }
    return credits;
  }
}

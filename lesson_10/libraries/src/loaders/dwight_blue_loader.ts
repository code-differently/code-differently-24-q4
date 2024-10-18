import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class DwightBlueLoader implements Loader {
  getLoaderName(): string {
    return 'dwightblue';
  }

  async loadData(): Promise<MediaItem[]> {
    const credits = await this.loadCredits();
    const mediaItems = await this.loadMediaItems();

    for (let i = 0; i < mediaItems.length; i++) {
      mediaItems[i].addCredit(credits[i]);
      console.log(mediaItems[i]);
    }

    console.log(
      `Loaded ${credits.length} credits and ${mediaItems.length} media items`,
    );

    return [...mediaItems.values()];
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    // TODO: Implement this method.
    const mediaItem = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { id, title, type, year } = row;
      mediaItem.push(new MediaItem(id, title, type, year, []));
    }
    return mediaItem;
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

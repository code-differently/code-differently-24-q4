import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class AnthonyMaysLoader implements Loader {
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
    return [];
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs.createReadStream('data/credits.csv');
    for await (const row of readable) {
      const [, mediaItemId, role, name] = row.split(',');
      credits.push({ mediaItemId, name, role });
    }
    return credits;
  }
}

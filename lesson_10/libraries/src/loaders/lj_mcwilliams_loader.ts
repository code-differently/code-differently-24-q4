import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class LjMcwilliamsLoader implements Loader {
  getLoaderName(): string {
    return 'ljmcwilliams';
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
    const media = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      /**this destructures the CSV file rows */
      const { id, type, title, year } = row;
      media.push(new MediaItem(id, title, type, year, []));
    }
    return media;
  }

  /*
  an asyncchronous function named loadCredits
  returns a Promise of an array of Credit Objects
  */
  async loadCredits(): Promise<Credit[]> {
    //the empty credits array will store parsed credit data
    const credits = [];
    /**
     * this var creates a readable stream from the CSV file and
     * is piped through the csv function to parse the data
     */
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    //this asynchronously iterates over each row of the parsed CSV data
    for await (const row of readable) {
      const { media_item_id, role, name } = row;
      credits.push(new Credit(media_item_id, name, role));
    }
    return credits;
  }
}

import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class YafiahAbdullahLoader implements Loader {
  getLoaderName(): string {
    return 'yafiahabdullah';
  }

  async loadData(): Promise<MediaItem[]> {
    const [credits, mediaItems] = await Promise.all([
      this.loadCredits(),
      this.loadMediaItems(),
    ]);
    // const credits = await this.loadCredits();
    // const mediaItems = await this.loadMediaItems();

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
      const { id, type, title, year } = row;
      media.push(new MediaItem(id, title, type, year, []));
    }
    return media;
  }

  //   //EXTRA CREDIT
  //      async loadMediaItems(): Promise<MediaItem[]> {
  //       const mediaItem = fs.readFileSync('data/media_items.csv',{
  //           encoding: 'utf-8'
  //       })
  //       .split('\n')
  //       .map((row:string): string[] =>{
  //           return row.split(',');
  //       })
  //       return [];
  // }

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

import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem } from '../models/index.js';
import { Loader } from './loader.js';

export class AmiyahJonesLoader implements Loader {
  getLoaderName(): string {
    return 'amiyahjones';
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
    return [
      
         class Movie1 {

          constructor(id: number , type: string, title: string, genre: string, year: number){
          id = 1;
          type = 'movie';
          title = 'Inception';
          genre = 'Sci-Fi';
          year = 2010;
          }
        }  

        let testMovie = this.loadMediaItems(Movie1);
    ];
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
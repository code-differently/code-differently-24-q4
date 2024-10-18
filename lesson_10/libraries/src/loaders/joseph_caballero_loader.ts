import fs from 'fs';
import { Credit, MediaItem, MediaType, Role } from '../models/index.js';
import { Loader } from './loader.js';

export class JosephCaballeroLoader implements Loader {
  getLoaderName(): string {
    return 'josephcaballero';
  }

  async loadData(): Promise<MediaItem[]> {
    const credits = await this.loadCredits();
    const mediaItems = await this.loadMediaItems();

    console.log(
      `Loaded ${credits.length} credits and ${mediaItems.length} media items`,
    );
    mediaItems.forEach((item) => {
      credits.forEach((id) => {
        if (id.getMediaItemId() == item.getId()) {
          item.addCredit(id);
        }
      });
    });

    return [...mediaItems.values()];
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    // TODO: Implement this method.
    const items = [];
    const load = fs
      .readFileSync('data/media_items.csv', {
        encoding: 'utf-8',
      })
      .split('\n')
      .map((row: string): string[] => {
        return row.split(',');
      });
    load.splice(0, 1);
    interface arrayObj {
      id: string;
      title: string;
      type: MediaType.Documentary | MediaType.Movie | MediaType.TVShow;
      year: number;
    }
    const obj: arrayObj[] = load.map((row: string[]): arrayObj => {
      return {
        id: row[0],
        title: row[2],
        type: row[1] as MediaType,
        year: Number(row[4]),
      };
    });
    for await (const row of obj) {
      const { id, type, title, year } = row;
      items.push(new MediaItem(id, title, type, year, []));
    }
    return items;
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const load = fs
      .readFileSync('data/media_items.csv', {
        encoding: 'utf-8',
      })
      .split('\n')
      .map((row: string): string[] => {
        return row.split(',');
      });
    load.splice(0, 1);
    interface arrayObj {
      media_Item_Id: string;
      type: string;
      role: Role;
    }
    const obj: arrayObj[] = load.map((row: string[]): arrayObj => {
      return { media_Item_Id: row[0], type: row[1], role: row[2] as Role };
    });
    for await (const row of obj) {
      const { media_Item_Id, type, role } = row;
      credits.push(new Credit(media_Item_Id, type, role));
    }
    return credits;
  }
}

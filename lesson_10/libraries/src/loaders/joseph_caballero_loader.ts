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
      if (MediaType.Documentary == row[1]) {
        return {
          id: row[0],
          title: row[2],
          type: (row[1] = MediaType.Documentary),
          year: Number(row[4]),
        };
      } else if (MediaType.TVShow == row[1]) {
        return {
          id: row[0],
          title: row[2],
          type: (row[1] = MediaType.TVShow),
          year: Number(row[4]),
        };
      } else {
        return {
          id: row[0],
          title: row[2],
          type: (row[1] = MediaType.Movie),
          year: Number(row[4]),
        };
      }
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
      role:
        | Role.Actor
        | Role.Cinematographer
        | Role.Composer
        | Role.CostumeDesigner
        | Role.Director
        | Role.Editor
        | Role.MakeupArtist
        | Role.Producer
        | Role.ProductionDesigner
        | Role.SoundDesigner
        | Role.StuntCoordinator
        | Role.Writer;
    }
    const obj: arrayObj[] = load.map((row: string[]): arrayObj => {
      if (row[2] == Role.Actor) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Actor),
        };
      }
      if (row[2] == Role.Cinematographer) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Cinematographer),
        };
      }
      if (row[2] == Role.Composer) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Composer),
        };
      }
      if (row[2] == Role.CostumeDesigner) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.CostumeDesigner),
        };
      }
      if (row[2] == Role.Director) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Director),
        };
      }
      if (row[2] == Role.Editor) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Editor),
        };
      }
      if (row[2] == Role.MakeupArtist) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.MakeupArtist),
        };
      }
      if (row[2] == Role.Producer) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Producer),
        };
      }
      if (row[2] == Role.ProductionDesigner) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.ProductionDesigner),
        };
      }
      if (row[2] == Role.SoundDesigner) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.SoundDesigner),
        };
      }
      if (row[2] == Role.StuntCoordinator) {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.StuntCoordinator),
        };
      } else {
        return {
          media_Item_Id: row[0],
          type: row[1],
          role: (row[2] = Role.Writer),
        };
      }
    });
    for await (const row of obj) {
      const { media_Item_Id, type, role } = row;
      credits.push(new Credit(media_Item_Id, type, role));
    }
    return credits;
  }
}

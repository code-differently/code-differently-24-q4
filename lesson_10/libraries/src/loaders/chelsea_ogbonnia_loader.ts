import csv from 'csv-parser';
import fs from 'fs';
import { Credit, MediaItem, MediaType } from '../models/index.js';
import { Loader } from './loader.js';

export class ChelseaOgbonniaLoader implements Loader {
  getLoaderName(): string {
    return 'chesleaogbonnia';
  }

  async loadData(): Promise<MediaItem[]> {
    const credits = await this.loadCredits();
    const mediaItems = await this.loadMediaItems();

    const creditsMap: Record<string, Credit[]> = {};

    credits.forEach((credit) => {
      const mediaItemId = credit.getMediaItemId();
      if (!creditsMap[mediaItemId]) {
        creditsMap[mediaItemId] = [];
      }
      creditsMap[mediaItemId].push(credit);
    });

    mediaItems.forEach((mediaItem) => {
      const mediaItemId = mediaItem.getId();
      const associatedCredits = creditsMap[mediaItemId] || [];

      associatedCredits.forEach((credit) => mediaItem.addCredit(credit));
    });

    console.log(
      `Loaded ${credits.length} credits and ${mediaItems.length} media items`,
    );

    return mediaItems;
  }

  async loadMediaItems(): Promise<MediaItem[]> {
    const mediaItems: MediaItem[] = [];
    const readable = fs
      .createReadStream('data/media_items.csv', 'utf-8')
      .pipe(csv());

    for await (const row of readable) {
      const { id, type, title, year } = row;
      let mediaType: MediaType | undefined;
      switch (type) {
        case 'movie':
          mediaType = MediaType.Movie;
          break;
        case 'tv_show':
          mediaType = MediaType.TVShow;
          break;
        case 'documentary':
          mediaType = MediaType.Documentary;
          break;
        default:
          throw new Error(`Unknown media type: ${type}`);
      }
      const releaseYear = Number(year);
      const mediaItem = new MediaItem(
        String(id),
        title,
        mediaType,
        releaseYear,
        [],
      );
      mediaItems.push(mediaItem);
    }
    return mediaItems;
  }

  async loadCredits(): Promise<Credit[]> {
    const credits = [];
    const readable = fs
      .createReadStream('data/credits.csv', 'utf-8')
      .pipe(csv());
    for await (const row of readable) {
      const { media_item_id: mediaItemId, role, name } = row;
      const credit = new Credit(mediaItemId, name, role);
      credits.push(credit);
    }
    return credits;
  }
}

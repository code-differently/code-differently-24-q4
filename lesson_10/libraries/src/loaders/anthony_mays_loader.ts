import { MediaItem } from '../models/media_item.js';
import { Loader } from './loader.js';

export class AnthonyMaysLoader implements Loader {
  getLoaderName(): string {
    return 'anthonymays';
  }

  async loadData(): Promise<MediaItem[]> {
    return [];
  }
}

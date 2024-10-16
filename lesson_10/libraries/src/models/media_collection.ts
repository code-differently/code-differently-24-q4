import { MediaItem } from './media_item.js';
import { SearchCriteria } from './search_criteria.js';

export class MediaCollection {
  private readonly items = new Map<string, MediaItem>();

  addItem(item: MediaItem): void {
    this.items.set(item.getId(), item);
  }

  removeItem(id: string): boolean {
    return this.items.delete(id);
  }

  search(criteria?: SearchCriteria): ReadonlySet<MediaItem> {
    const items = [...this.items.values()];
    if (!criteria) {
      return new Set(items);
    }
    const title = criteria.title;
    if (title) {
      return new Set(items.filter((item) => item.getTitle().includes(title)));
    }
    if (criteria.releaseYear) {
      return new Set(
        items.filter((item) => item.getReleaseYear() === criteria.releaseYear),
      );
    }
    if (criteria.type) {
      return new Set(items.filter((item) => item.getType() === criteria.type));
    }
    if (criteria.creditName) {
      return new Set(
        items.filter((item) =>
          [...item.getCredits()].some(
            (credit) => credit.name === criteria.creditName,
          ),
        ),
      );
    }
    return new Set(items);
  }

  searchByTitle(title: string): MediaItem[] {
    return [...this.items.values()].filter((item) =>
      item.getTitle().includes(title),
    );
  }

  searchByReleaseYear(releaseYear: number): MediaItem[] {
    return [...this.items.values()].filter(
      (item) => item.getReleaseYear() === releaseYear,
    );
  }

  searchByType(type: string): MediaItem[] {
    return [...this.items.values()].filter((item) => item.getType() === type);
  }

  searchByCreditName(name: string): MediaItem[] {
    return [...this.items.values()].filter((item) =>
      [...item.getCredits()].some((credit) => credit.name === name),
    );
  }
  getInfo() {
    return {
      getItems: () => [...this.items] as readonly [string, MediaItem][],
    };
  }
}

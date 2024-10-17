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
      return this.searchByTitle(title);
    }
    if (criteria.releaseYear) {
      return this.searchByReleaseYear(criteria.releaseYear);
    }
    if (criteria.type) {
      return this.searchByType(criteria.type);
    }
    if (criteria.creditName) {
      return this.searchByCreditName(criteria.creditName);
    }
    return new Set(items);
  }

  searchByTitle(title: string): ReadonlySet<MediaItem> {
    return new Set(
      [...this.items.values()].filter((item) =>
        item
          .getTitle()
          .toLowerCase()
          .includes(title?.toLowerCase() ?? ''),
      ),
    );
  }

  searchByReleaseYear(releaseYear: number): ReadonlySet<MediaItem> {
    return new Set(
      [...this.items.values()].filter(
        (item) => item.getReleaseYear() === releaseYear,
      ),
    );
  }

  searchByType(type: string): ReadonlySet<MediaItem> {
    return new Set(
      [...this.items.values()].filter((item) => item.getType() === type),
    );
  }

  searchByCreditName(name: string): ReadonlySet<MediaItem> {
    return new Set(
      [...this.items.values()].filter((item) =>
        item.getCredits().some((credit) =>
          credit
            .getName()
            .toLowerCase()
            .includes(name?.toLowerCase() ?? ''),
        ),
      ),
    );
  }

  getInfo() {
    return {
      getItems: () => [...this.items] as readonly [string, MediaItem][],
    };
  }
}

import { SearchCriteria } from "./search_criteria";
import { Searchable } from "./searchable";

export class CatalogSearcher<T extends Searchable> {
    private catalog: Iterable<T>;

    constructor(catalog: Iterable<T>) {
        this.catalog = catalog;
    }

    search(query: SearchCriteria): T[] {
        return [...this.catalog].filter(item => item.matches(query));
    }
}

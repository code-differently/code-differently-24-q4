type CollectionItem = { id?: number; updated_at: string };

export type DbTodo = CollectionItem & {
  text: string;
  completed: boolean;
  user_id: string;
};

type FindManyArgs<T> = {
  where: Partial<T>;
  orderBy?: { [K in keyof T]?: 'asc' | 'desc' };
};

type CreateArgs<T> = {
  data: T;
};

type UpdateArgs<T> = FindManyArgs<T> & {
  data: Partial<T>;
};

class FakePrimaCollection<T extends CollectionItem> {
  constructor(private readonly items: T[] = []) {}

  findMany(criteria: FindManyArgs<T>): T[] {
    return this.items
      .filter((item) =>
        Object.keys(criteria.where).every(
          (key) => item[key as keyof T] === criteria.where[key as keyof T],
        ),
      )
      .sort((a, b) => {
        if (criteria.orderBy) {
          const key = Object.keys(criteria.orderBy)[0] as keyof T;
          return criteria.orderBy[key] === 'asc'
            ? a[key] > b[key]
              ? 1
              : -1
            : a[key] < b[key]
              ? 1
              : -1;
        }
        return (
          new Date(a.updated_at).getTime() - new Date(b.updated_at).getTime()
        );
      });
  }

  create(args: CreateArgs<T>): T {
    const item = {
      ...args.data,
      id: this.items.length + 1,
      updated_at: new Date(),
    };
    this.items.push(item);
    return item;
  }

  update(criteria: UpdateArgs<T>): T | undefined {
    const item = this.items.find((item) =>
      Object.keys(criteria.where).every(
        (key) => item[key as keyof T] === criteria.where[key as keyof T],
      ),
    );
    if (item) {
      Object.assign(item, criteria.data);
      item.updated_at = new Date().toISOString();
    }
    return item;
  }

  delete(criteria: FindManyArgs<T>): void {
    this.items.splice(
      this.items.findIndex((item) =>
        Object.keys(criteria.where).every(
          (key) => item[key as keyof T] === criteria.where[key as keyof T],
        ),
      ),
      1,
    );
  }
}

type FakePrismaClientOptions = {
  todos?: DbTodo[];
};

export class FakePrismaClient {
  private readonly _todos: DbTodo[] = [];
  readonly todos: FakePrimaCollection<DbTodo>;

  constructor(options: FakePrismaClientOptions = {}) {
    this.todos = new FakePrimaCollection(options?.todos);
  }
}

import { Module } from '@nestjs/common';
import { LibraryDataLoader, LibraryDataLoaderSymbol } from '../data/library_data_loader';
import { LibraryService } from './library.service';
import { LibraryFactory } from './library_factory';

const libraryServiceProvider = {
    provide: LibraryService,
    useFactory: (loader: LibraryDataLoader) => {
        return LibraryFactory.createWithLoader(loader);
    },
    inject: [LibraryDataLoaderSymbol],
};

@Module({
    providers: [libraryServiceProvider],
})
export class LibraryModule {}
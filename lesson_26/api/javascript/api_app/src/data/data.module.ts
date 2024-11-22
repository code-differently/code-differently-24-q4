import { Module } from '@nestjs/common';
import { LibraryJsonDataLoader } from './library_json_data_loader';

@Module({
    providers: [LibraryJsonDataLoader],
})
export class DataModule {}
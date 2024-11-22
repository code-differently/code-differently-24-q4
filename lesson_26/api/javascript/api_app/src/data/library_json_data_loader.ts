import { Injectable } from "@nestjs/common";
import { LibraryDataModel } from "src/models/library_data_model";
import LibraryJsonData from '../../resources/data.json';
import { LibraryDataLoader } from "./library_data_loader";

@Injectable()
export class LibraryJsonDataLoader implements LibraryDataLoader {
    async loadData() {
        const { mediaItems, guests } = LibraryJsonData;
        return new LibraryDataModel(mediaItems, guests);
    }
}
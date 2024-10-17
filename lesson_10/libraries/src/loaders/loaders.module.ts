import { Module } from '@nestjs/common';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { DasiaEnglishLoader } from './dasia_english_loader.js';

export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
const LOADER_PROVIDERS = [AnthonyMaysLoader, DasiaEnglishLoader];

@Module({
  providers: [
    ...LOADER_PROVIDERS,
    {
      provide: Loaders,
      useFactory: (...args) => [...args],
      inject: LOADER_PROVIDERS,
    },
  ],
  exports: [Loaders],
})
export class LoadersModule {}

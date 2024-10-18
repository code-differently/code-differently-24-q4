import { Module } from '@nestjs/common';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { ChelseaOgbonniaLoader } from './chelsea_ogbonnia_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';

export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
const LOADER_PROVIDERS = [
  AnthonyMaysLoader,
  ChelseaOgbonniaLoader,
  XavierCruzLoader,
];

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

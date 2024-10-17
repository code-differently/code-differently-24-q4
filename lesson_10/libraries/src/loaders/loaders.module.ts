import { Module } from '@nestjs/common';
import { HummadTanweerLoader } from './hummad_tanweer_loader.js';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';

export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
lesson_10
const LOADER_PROVIDERS = [HummadTanweerLoader, AnthonyMaysLoader];
const LOADER_PROVIDERS = [AnthonyMaysLoader, XavierCruzLoader];
main

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

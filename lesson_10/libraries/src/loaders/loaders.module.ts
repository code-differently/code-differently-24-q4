import { Module } from '@nestjs/common';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { ZionBuchananLoader } from './zion_buchanan_loader.js';
export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
const LOADER_PROVIDERS = [AnthonyMaysLoader, ZionBuchananLoader];

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

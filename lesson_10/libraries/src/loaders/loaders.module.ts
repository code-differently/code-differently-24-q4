import { Module } from '@nestjs/common';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';
import { AmiyahJonesLoader } from './amiyah_jones.js';

export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
const LOADER_PROVIDERS = [AnthonyMaysLoader, XavierCruzLoader, AmiyahJonesLoader];

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

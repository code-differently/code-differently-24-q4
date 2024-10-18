import { Module } from '@nestjs/common';
import { AngelicaCastilloLoader } from './angelica_castillo_loader.js';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { OyeyemiJimohLoader } from './oyeyemi_jimoh_loader.js';
import { JamesCapparellLoader } from './james_capparell_loader.js';
import { NileJacksonLoader } from './nile_jackson_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';

export const Loaders = Symbol.for('Loaders');

const LOADER_PROVIDERS = [
  AnthonyMaysLoader,
  AngelicaCastilloLoader,
  JamesCapparellLoader,
  NileJacksonLoader,
  XavierCruzLoader,
  OyeyemiJimohLoader,
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

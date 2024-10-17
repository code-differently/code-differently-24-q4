import { Module } from '@nestjs/common';
<<<<<<< HEAD
import { AngelicaCastilloLoader } from './angelica_castillo_loader.js';
=======
import { HummadTanweerLoader } from './hummad_tanweer_loader.js';
>>>>>>> 3c9aee8 (Feat: Fixed two files for lesson 10 by Hummad Tanweer)
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { JamesCapparellLoader } from './james_capparell_loader.js';
import { NileJacksonLoader } from './nile_jackson_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';

export const Loaders = Symbol.for('Loaders');

// Add your quiz provider here.
<<<<<<< HEAD
const LOADER_PROVIDERS = [
  AnthonyMaysLoader,
  AngelicaCastilloLoader,
  JamesCapparellLoader,
  NileJacksonLoader,
  XavierCruzLoader,
];
=======
const LOADER_PROVIDERS = [HummadTanweerLoader, AnthonyMaysLoader];
>>>>>>> 3c9aee8 (Feat: Fixed two files for lesson 10 by Hummad Tanweer)

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

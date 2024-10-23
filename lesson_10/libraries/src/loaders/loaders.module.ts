import { Module } from '@nestjs/common';

import { AmiyahJonesLoader } from './amiyah_jones.js';
import { AngelicaCastilloLoader } from './angelica_castillo_loader.js';
import { AnthonyMaysLoader } from './anthony_mays_loader.js';
import { ChelseaOgbonniaLoader } from './chelsea_ogbonnia_loader.js';
import { DavidSmithLoader } from './david_smith_loader.js';
import { DwightBlueLoader } from './dwight_blue_loader.js';
import { HummadTanweerLoader } from './hummad_tanweer_loader.js';
import { JamesCapparellLoader } from './james_capparell_loader.js';
import { JosephCaballeroLoader } from './joseph_caballero_loader.js';
import { KimberleeHaldaneLoader } from './kimberlee_haldane_loader.js';
import { NileJacksonLoader } from './nile_jackson_loader.js';
import { OyeyemiJimohLoader } from './oyeyemi_jimoh_loader.js';
import { PabloLimonParedesLoader } from './pablo_limon_paredes_loader.js';
import { ShawnDunsmoreLoader } from './shawn_dunsmore_loader.js';
import { TommyTranLoader } from './tommy_tran_loader.js';
import { XavierCruzLoader } from './xavier_cruz_loader.js';
import { YafiahAbdullahLoader } from './yafiah_abdullah_loader.js';
import { ZionBuchananLoader } from './zion_buchanan_loader.js';

export const Loaders = Symbol.for('Loaders');

const LOADER_PROVIDERS = [
  AmiyahJonesLoader,
  AngelicaCastilloLoader,
  AnthonyMaysLoader,
  ChelseaOgbonniaLoader,
  DavidSmithLoader,
  DwightBlueLoader,
  HummadTanweerLoader,
  JamesCapparellLoader,
  JosephCaballeroLoader,
  KimberleeHaldaneLoader,
  NileJacksonLoader,
  OyeyemiJimohLoader,
  PabloLimonParedesLoader,
  ShawnDunsmoreLoader,
  TommyTranLoader,
  XavierCruzLoader,
  YafiahAbdullahLoader,
  ZionBuchananLoader,
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

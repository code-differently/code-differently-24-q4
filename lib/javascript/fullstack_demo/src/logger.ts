import { Logger } from '@/util/logger';
import { WinstonLogger } from '@/util/winston-logger';

export const logger: Logger = new WinstonLogger();

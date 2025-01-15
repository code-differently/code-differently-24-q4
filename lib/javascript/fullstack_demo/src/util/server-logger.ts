import { auth } from '@clerk/nextjs/server';
import { headers } from 'next/headers';
import winston, { format } from 'winston';
import { Logger, LogLevel } from './logger';
const { combine, timestamp, json } = format;

export class WinstonLogger implements Logger {
  private readonly winstonLogger: winston.Logger;

  constructor() {
    this.winstonLogger = winston.createLogger({
      level: 'info',
      format: combine(
        format((info) => {
          const headerList = headers();
          info.correlationId = headerList.get('x-correlation-id');
          return info;
        })(),
        timestamp(),
        json(),
      ),
      transports: [
        new winston.transports.Console(),
        new winston.transports.File({ filename: 'debug.log', level: 'debug' }),
      ],
    });
  }

  async log(level: LogLevel, message: string, ...vars: unknown[]) {
    const { userId } = await auth();
    this.winstonLogger.log(level.toLowerCase(), message, { ...vars, userId });
  }

  async debug(format: string, ...vars: unknown[]) {
    const { userId } = await auth();
    this.winstonLogger.debug(format, { ...vars, userId });
  }

  async info(format: string, ...vars: unknown[]) {
    const { userId } = await auth();
    this.winstonLogger.info(format, { ...vars, userId });
  }

  async error(format: string, ...vars: unknown[]) {
    const { userId } = await auth();
    this.winstonLogger.error(format, { ...vars, userId });
  }
}

export const logger = new WinstonLogger();

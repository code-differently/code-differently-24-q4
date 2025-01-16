import { LogEvent } from '@/models';
import { auth } from '@clerk/nextjs/server';
import { headers } from 'next/headers';
import winston, { format } from 'winston';
import { Logger, LogLevel } from './logger';
import { PrismaTransport } from './prisma-transport';
const { combine, timestamp, json } = format;

export class WinstonLogger implements Logger {
  private readonly winstonLogger: winston.Logger;

  constructor() {
    this.winstonLogger = winston.createLogger({
      level: 'debug',
      format: combine(
        format((info) => {
          const headerList = headers();
          info.correlationId = headerList.get('x-correlation-id');
          info.environment = process.env.NODE_ENV;
          return info;
        })(),
        timestamp(),
        json(),
      ),
      transports: [
        new winston.transports.Console({ level: 'info' }),
        new winston.transports.File({ filename: 'debug.log', level: 'debug' }),
        new PrismaTransport({ level: 'debug' }),
      ],
    });
  }

  async log(level: LogLevel, message: string, vars = {}) {
    const { userId } = await auth();
    this.winstonLogger.log(level.toLowerCase(), message, { ...vars, userId });
  }

  async debug(format: string, vars = {}) {
    const { userId } = await auth();
    this.winstonLogger.debug(format, { ...vars, userId });
  }

  async info(format: string, vars = {}) {
    const { userId } = await auth();
    this.winstonLogger.info(format, { ...vars, userId });
  }

  async error(format: string, vars = {}) {
    const { userId } = await auth();
    this.winstonLogger.error(format, { ...vars, userId });
  }

  async event(eventId: LogEvent, vars = {}) {
    const { userId } = await auth();
    this.winstonLogger.debug('', { ...vars, userId, eventId });
  }
}

export const logger = new WinstonLogger();

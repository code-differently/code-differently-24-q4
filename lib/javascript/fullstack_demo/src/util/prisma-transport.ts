import { PrismaClient } from '@prisma/client';
import Transport from 'winston-transport';

export class PrismaTransport extends Transport {
  private readonly client = new PrismaClient();

  constructor(opts: any) {
    super(opts);
  }

  async log(info: any, callback: () => void): Promise<void> {
    setImmediate(() => {
      this.emit('logged', info);
    });

    try {
      await this.client.logs.create({
        data: {
          level: info.level,
          message: info.message,
          meta: info,
          timestamp: info.timestamp,
        },
      });
    } catch (ex) {
      console.error('Failed to log to Prisma', ex);
    }

    callback();
  }
}

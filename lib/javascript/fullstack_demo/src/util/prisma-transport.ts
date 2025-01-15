import { PrismaClient } from '@prisma/client';
import Transport from 'winston-transport';

export class PrismaTransport extends Transport {
  private readonly client = new PrismaClient();

  constructor(opts: any) {
    super(opts);
  }

  log(info: any, callback: () => void): void {
    setImmediate(() => {
      this.emit('logged', info);
    });

    this.client.logs.create({
      data: {
        level: info.level,
        message: info.message,
        meta: info.vars,
        timestamp: info.timestamp,
      },
    });

    callback();
  }
}

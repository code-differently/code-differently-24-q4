import { Redis } from '@upstash/redis';
import { v4 as uuidv4 } from 'uuid';
import Transport from 'winston-transport';

export class RedisTransport extends Transport {
  private readonly redis: Redis;

  constructor(opts: any) {
    super(opts);
    this.redis = new Redis({
      url: process.env.KV_REST_API_URL,
      token: process.env.KV_REST_API_TOKEN,
    });
  }

  async log(info: any, callback: () => void): Promise<void> {
    setImmediate(() => {
      this.emit('logged', info);
    });

    try {
      const uuid = uuidv4();
      await this.redis.append(`logs:${uuid}`, JSON.stringify(info));
    } catch (ex) {
      console.error('Failed to log to Redis', ex);
    }

    callback();
  }
}

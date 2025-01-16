import { Log, LogEvent } from '@/models';
import { Logger, LogLevel } from './logger';

const FLUSH_AFTER_SIZE = 15;
const MAX_BATCH_SIZE = 100;
const FLUSH_INTERVAL_MS = 1000 * 5; // 5 seconds

class ClientLogger implements Logger {
  private readonly buffer: Log[] = [];
  private flushing = false;

  constructor() {
    setInterval(() => this.flush(), FLUSH_INTERVAL_MS);
  }

  log(level: LogLevel, message: string, vars = {}): void {
    vars = { ...this.getDefaultVars(), ...(vars || {}) };
    this.buffer.push({ level, message, vars });
    if (this.buffer.length >= FLUSH_AFTER_SIZE && !this.flushing) {
      this.flush();
    }
  }

  private getDefaultVars() {
    if (typeof window === 'undefined') {
      return [];
    }

    return {
      client: {
        type: 'web',
        userAgent: navigator.userAgent,
        location: window.location.href,
      },
    };
  }

  async flush(): Promise<void> {
    if (this.buffer.length === 0 || this.flushing) {
      return;
    }

    this.flushing = true;

    const batch = this.buffer.splice(0, MAX_BATCH_SIZE);
    let backoffInMs = FLUSH_INTERVAL_MS;

    do {
      try {
        await this.sendLogs(batch);
        this.flushing = false;
      } catch (e) {
        console.error('Failed to send logs', e);
        backoffInMs *= 2;
        await this.delay(backoffInMs);
      }
    } while (this.flushing);
  }

  async sendLogs(batch: Log[]): Promise<void> {
    let endpoint = '/api/log';
    if (typeof window === 'undefined') {
      endpoint = `${process.env?.NEXT_PUBLIC_API_URL || ''}/api/host`;
    }
    await fetch(endpoint, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(batch),
    });
  }

  async delay(ms: number): Promise<void> {
    return new Promise((resolve) => setTimeout(resolve, ms));
  }

  debug(format: string, vars = {}): void {
    this.log('debug', format, vars);
  }
  info(format: string, vars = {}): void {
    this.log('info', format, vars);
  }
  error(format: string, vars = {}): void {
    this.log('error', format, vars);
  }
  event(eventId: LogEvent, vars = {}): void {
    this.log('info', '', { ...vars, eventId });
  }
}

export const logger = new ClientLogger();

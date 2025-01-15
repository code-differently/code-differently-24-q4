import { Logger, LogLevel } from './logger';

class ClientLogger implements Logger {
  log(level: LogLevel, message: string, ...vars: unknown[]): void {
    fetch('/api/log', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ level, message, vars }),
    });
  }

  debug(format: string, ...vars: unknown[]): void {
    this.log('DEBUG', format, ...vars);
  }
  info(format: string, ...vars: unknown[]): void {
    this.log('INFO', format, ...vars);
  }
  error(format: string, ...vars: unknown[]): void {
    this.log('ERROR', format, ...vars);
  }
}

export const logger = new ClientLogger();

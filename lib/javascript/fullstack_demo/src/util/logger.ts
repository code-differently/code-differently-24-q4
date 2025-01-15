export interface Logger {
  log(level: LogLevel, message: string, ...vars: unknown[]): void;
  debug(format: string, ...vars: unknown[]): void;
  info(format: string, ...vars: unknown[]): void;
  error(format: string, ...vars: unknown[]): void;
}

export type LogLevel = 'DEBUG' | 'INFO' | 'ERROR' | 'WARN';

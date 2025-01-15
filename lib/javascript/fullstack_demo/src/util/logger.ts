export interface Logger {
  log(level: LogLevel, message: string, vars?: {}): void;
  debug(format: string, vars?: {}): void;
  info(format: string, vars?: {}): void;
  error(format: string, vars?: {}): void;
}

export type LogLevel = 'debug' | 'info' | 'error' | 'warn';

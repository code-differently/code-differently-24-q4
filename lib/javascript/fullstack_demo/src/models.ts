import { LogLevel } from './util/logger';

export interface Todo {
  id: number;
  text: string;
  completed: boolean;
}

export interface Log {
  level: LogLevel;
  message: string;
  vars: {};
}

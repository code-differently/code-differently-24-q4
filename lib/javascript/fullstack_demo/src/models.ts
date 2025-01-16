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

export enum LogEvent {
  LOG_IN = 'log_in',
  LOG_OUT = 'log_out',
  TODO_TOGGLE = 'todo_toggle',
  TODO_DELETE = 'todo_delete',
  TODO_ADD = 'todo_add',
}

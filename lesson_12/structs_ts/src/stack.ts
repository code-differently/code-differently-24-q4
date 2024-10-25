/* eslint-disable @typescript-eslint/no-non-null-assertion */
import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    const newNode = new ListNode(value);
    newNode.next = this.top;
    this.top = newNode;
  }

  pop(): number | undefined {
    if (this.isEmpty()) return undefined;
    const value = this.top!.value;
    this.top = this.top!.next;
    return value;
  }

  peek(): number | null {
    return this.isEmpty() ? null : this.top?.value;
  }

  isEmpty(): boolean {
    return this.top === undefined;
  }
}

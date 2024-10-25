/* eslint-disable @typescript-eslint/no-non-null-assertion */
import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(val: number): void {
    const newNode = new ListNode(val);
    newNode.next = this.top;
    this.top = newNode;
  }

  pop(): number | undefined {
    if (this.isEmpty()) return undefined;
    const val = this.top!.val;
    this.top = this.top!.next;
    return val;
  }

  peek(): number {
    if (this.isEmpty()) {
      /* empty */
    }
    return this.top!.val;
  }

  isEmpty(): boolean {
    return this.top === undefined;
  }
}

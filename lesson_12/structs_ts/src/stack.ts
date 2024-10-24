import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    const pusher = new ListNode(value);
    pusher.next = this.top;
    this.top = pusher;
  }

  pop(): number | undefined {
    const val = this.top?.val;
    this.top = this.top?.next;
    return val;
  }

  peek(): number | null {
    if (this.top != null) {
      return this.top.val;
    } else {
      throw new Error('empty stack');
    }
  }

  isEmpty(): boolean {
    return this.top == null;
  }
}

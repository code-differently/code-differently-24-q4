import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    const newnode = new ListNode(value);
    newnode.next = this.top;
    this.top = newnode;
  }

  pop(): number | undefined {
    const nodevalue = this.top?.val;
    this.top = this.top?.next;
    return nodevalue;
  }

  peek(): number | null {
    if (this.top === undefined) {
      throw new Error('is Empty');
    }
    return this.top ? this.top.val : null;
  }
  isEmpty(): boolean {
    return this.top === undefined;
  }
}

import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | null;

  constructor() {
    this.top = null;
  }

  push(value: number): void {
    const newNode = new ListNode(value);
    newNode.next = this.top !== null ? this.top : undefined;
    this.top = newNode;
  }

  pop(): number | undefined {
    if (this.isEmpty()) {
      throw new Error('Stack is empty');
    }
    const value = this.top!.val;
    this.top = this.top!.next || null;
    return value;
  }

  peek(): number | null {
    if (this.isEmpty()) {
      throw new Error('Stack is empty');
    }
    return this.top!.val;
  }

  isEmpty(): boolean {
    return this.top === null;
  }
}

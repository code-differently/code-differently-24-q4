import { ListNode } from './list_node.js';

export class Stack {
  private top?: ListNode;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    const newNode = new ListNode(value, this.top);
    this.top = newNode;
  }

  pop(): number {
    if (this.isEmpty()) {
      throw new Error("Stack is empty");
    }
    const value = this.top!.val; // Non-null assertion since we've checked for emptiness
    this.top = this.top?.next; // No change needed here, TypeScript allows accessing next
    return value;
  }

  peek(): number {
    if (this.isEmpty()) {
      throw new Error("Stack is empty");
    }
    return this.top!.val; // Non-null assertion since we've checked for emptiness
  }

  isEmpty(): boolean {
    return this.top === undefined; // Check for undefined since top is optional
  }
}

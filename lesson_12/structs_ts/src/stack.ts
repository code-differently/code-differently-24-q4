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
    if (this.top === undefined) {
      return undefined;
    }
    const poppedNode = this.top;
    this.top = this.top.next;
    return poppedNode.val;
  }

  peek(): number | null {
    if (this.top === undefined) {
      throw new Error('Stack is empty');
    }
    return this.top.val;
  }

  isEmpty(): boolean {
    return this.top === undefined;
  }
}

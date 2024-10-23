import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    // ListNode newNode = new ListNode(value);
    const newNode = new ListNode(value)
    // newNode.next = top;
    newNode.next = this.top;
    // top = newNode;
    this.top = newNode;
  }

  pop(): number | undefined {
    // if (this.isEmpty()) {
    //   throw new EmptyStackException();
    // } else {
    //   int value = top.val;
    //   top = top.next;
    //   return value;
    // }
    if (this.isEmpty()) {
      return undefined;
    }

    const value = this.top?.val;
    this.top = this.top.next;
    return value;
  }

  peek(): number | null {
    // if (this.isEmpty()) {
      // throw new EmptyStackException();
    // }
    // return top.val;
    if (this.isEmpty()) {
      return undefined;
    } 

    return this.top?.val;
  }

  isEmpty(): boolean {
    return this.top === undefined;
  }
}

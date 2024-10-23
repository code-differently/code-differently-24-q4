import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    // ListNode newNode = new ListNode(value);
    // newNode.next = top;
    // top = newNode;
  }

  pop(): number | undefined {
    return 0;
    // if (this.isEmpty()) {
    //   throw new EmptyStackException();
    // } else {
    //   int value = top.val;
    //   top = top.next;
    //   return value;
    // }
  }

  peek(): number | null {
     return 0;
    // if (this.isEmpty()) {
      // throw new EmptyStackException();
    // }
    // return top.val;
  }

  isEmpty(): boolean {
    return top == null;
  }
}

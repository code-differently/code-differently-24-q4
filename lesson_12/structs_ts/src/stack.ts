import { ListNode } from './list_node.js';

export class Stack {
  private top: ListNode | undefined;

  constructor() {
    this.top = undefined;
  }

  push(value: number): void {
    let node: ListNode | undefined = new ListNode(value);

    node.next = this.top;
    this.top = node;

  }

  pop(): number | undefined {
    if(this.isEmpty()){
      throw new Error('Stack is empty');
    }

    if (this.top){
      let value_to_pop: number = this.top.val
      this.top = this.top.next;
      return value_to_pop;
    }

    return undefined;
  }

  peek(): number | null {
    if (this.isEmpty()){
      throw new Error('Stack is empty');
    }

    if (this.top){
      return this.top.val;
    }

    return null;

  }

  isEmpty(): boolean {
    return top === undefined;
  }
}

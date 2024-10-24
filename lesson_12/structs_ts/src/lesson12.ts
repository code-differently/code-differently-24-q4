import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
   let ListNode, current = head;
    let even = 0;
    let odd = 0;
    while (current != null && current.next != null) {
      let next: ListNode | null = null;
      if (head === null) {
        odd++;
      }
      if (current.val > nextNode.val) {
        even++;
      }
      current === nextNode.next;
    }
    if (even > odd) {
      return "Even";
    }
    if (even < odd) {
      return "Odd";
    }
    if (even === odd) {
      return "Tie";
    }
    return null;
  }
}

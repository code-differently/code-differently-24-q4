import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    let even = 0;
    let odd = 0;
    while (head != null && head.next != null) {
      if (head.val > head.next.val) {
        even++;
      } else {
        odd++;
      }
      head = head.next.next !== undefined ? head.next.next : null;
    }
    if (even === odd) {
      return 'Tie';
    } else if (even > odd) {
      return 'Even';
    } else {
      return 'Odd';
    }
  }
}

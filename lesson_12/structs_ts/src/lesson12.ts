import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    let oddPoints = 0;
    let evenPoints = 0;
    let current: ListNode | null = head;

    while (current && current.next) {
      if (current.val > current.next.val) {
        evenPoints++;
      } else {
        oddPoints++;
      }
      current = current.next.next || null;
    }

    if (oddPoints > evenPoints) {
      return 'Odd';
    } else if (evenPoints > oddPoints) {
      return 'Even';
    } else {
      return 'Tie';
    }
  }
}

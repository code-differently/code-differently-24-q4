import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    let oddPoints: number = 0;
    let evenPoints: number = 0;

    let curr = head;

    while (curr != null && curr.next != null) {
      if (curr.val > curr.next.val) {
        evenPoints++;
      } else if (curr.val < curr.next.val) {
        oddPoints++;
      }
      curr = curr.next.next as ListNode;
    }

    if (oddPoints > evenPoints) {
      return "Odd";
    } else if (oddPoints < evenPoints) {
      return "Even";
    } else {
      return "Tie";
    }
  }
}
 
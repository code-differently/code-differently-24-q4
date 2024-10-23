import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
   let current: ListNode| null = head;
    let evenPoints = 0;
    let oddPoints = 0;
    while (current !== null && current.next != null) {
      if (current.val > current.next.val) {
        evenPoints++;
      } else if (current.val < current.next.val) {
        oddPoints++;
      }
   current =current.next.next != undefined? current.next.next : null;
    }
    if (evenPoints > oddPoints) {
      return 'Even';
    } else if (oddPoints > evenPoints) {
      return 'Odd';
    } else {
      return 'Tie';
    }
  }
}

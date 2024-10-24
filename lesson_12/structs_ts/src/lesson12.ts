import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    let current = head;
    let oddPoints = 0;
    let evenPoints = 0;

    while (current != null && current.next != null) {
      if (current.next.next == null) {
        if (current.val > current.next.val) {
          evenPoints++;
          break;
        } else {
          oddPoints++;
          break;
        }
      } else {
        if (current.val > current.next.val) {
          evenPoints++;
          current = current.next.next;
        } else {
          oddPoints++;
          current = current.next.next;
        }
      }
    }

    if (oddPoints > evenPoints) {
      return 'Odd';
    } else if (oddPoints < evenPoints) {
      return 'Even';
    } else {
      return 'Tie';
    }
  }
}

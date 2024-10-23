import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    const oddPoints = 0;
    const evenPoints = 0;

    // ListNode current = head;
    class ListNode {
      current: null | undefined;
      costructor(head = null) {
        this.current = head;
      }
    }

    // while(current != null && current.next != null) {
    //   if (current.val > current.next.val) {
    //     evenPoints++;
    //   } else if (current.val < current.next.val) {
    //     oddPoints++;
    //   }
    //   current = current.next.next;
    // }

    if (oddPoints > evenPoints) {
      return "Odd";
    } else if (evenPoints > oddPoints) {
      return "Even";
    } else {
      return "Tie";
    }
  }
}

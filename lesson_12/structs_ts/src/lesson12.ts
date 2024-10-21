import { ListNode } from './list_node.js';

export class Lesson12 {
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    let e_pts = 0;
    let o_pts = 0;

    if (head === null) {
      return '';
    }

    let curr: ListNode | undefined = head;

    while (curr != null) {
      const next: ListNode | undefined = curr.next;
      if (next === undefined) {
        return '';
      }
      if (curr.val > next?.val) {
        e_pts++;
      } else if (curr.val < next?.val) {
        o_pts++;
      }
      curr = next.next;
    }

    if (e_pts === o_pts) {
      return 'Tie';
    }

    return e_pts > o_pts ? 'Even' : 'Odd';
  }
}

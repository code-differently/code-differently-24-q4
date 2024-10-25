/* eslint-disable @typescript-eslint/no-unused-vars */
import { ListNode } from './list_node.js';

export class Lesson12 {
  push(scores: number): void {
    throw new Error('Not implemented');
  }
  /**
   * Provide the solution to LeetCode 3062 here:
   * https://github.com/yang-su2000/Leetcode-algorithm-practice/tree/master/3062-winner-of-the-linked-list-game
   */
  public gameResult(head: ListNode | null): string {
    if (!head) return 'Tie';

    let current: ListNode | null = head;
    const scores: number[] = [0, 0];

    while (current && current.next) {
      if (current.val !== current.next.val && current.val % 2 == 0) {
        if (current.val > current.next.val) {
          scores[0]++;
        } else {
          scores[1]++;
        }
      }
      current = current.next;
    }
    if (scores[0] > scores[1]) {
      return 'Even';
    } else if (scores[0] < scores[1]) {
      return 'Odd';
    } else {
      return 'Tie';
    }
  }
}

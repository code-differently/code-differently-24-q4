import { ListNode } from './list_node.js';

export class Lesson12 {
  public gameResult(head: ListNode | null): string {
    let scoreEven = 0;
    let scoreOdd = 0;
    let current: ListNode | null = head;
    let index = 0;

    while (current !== null) {
      // Check if the index is even
      if (index % 2 === 0) {
        // Only check nextNode if current is not the last node
        const nextNode = current.next;
        if (nextNode != undefined) {
          if (current.val > nextNode.val) {
            scoreEven += 1;
          } else if (current.val < nextNode.val) {
            scoreOdd += 1;
          }
        }
      }

      // Move to the next node
      current = current.next ?? null;
      index++; // Increment the index
    }

    if (scoreEven > scoreOdd) {
      return 'Even';
    } else if (scoreEven < scoreOdd) {
      return 'Odd';
    } else {
      return 'Tie';
    }
  }
}

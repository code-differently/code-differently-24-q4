import { ListNode } from './list_node.js';

export class Lesson12 {
  public gameResult(head: ListNode): string {
    let scoreEven = 0;
    let scoreOdd = 0;
    let evenNum = 0;
    let oddNum = 0;
    const length = this.getLength(head);

    for (let i = 0; i < length; i++) {
      const resultNode = this.getElementAt(head, i);
      if (resultNode) {
        if (i % 2 === 0) {
          evenNum = resultNode.val;
        } else {
          oddNum = resultNode.val;
          if (evenNum > oddNum) {
            scoreEven += 1;
          } else if (evenNum < oddNum) {
            scoreOdd += 1;
          }
        }
      }
    }

    if (scoreEven > scoreOdd) {
      return 'Even';
    } else if (scoreEven < scoreOdd) {
      return 'Odd';
    } else {
      return 'Tie';
    }
  }

  getElementAt(head: ListNode | undefined, position: number): ListNode | undefined {
    let current = head;
    let index = 0;

    while (current !== undefined) {
      if (index === position) {
        return current; // Return the node at the specified position
      }
      current = current.next; // Move to the next node
      index++; // Increment the index
    }

    return undefined; // Return null if the position is out of bounds
  }

  getLength(head: ListNode | undefined): number {
    let length = 0;
    let current = head;

    while (current !== undefined) {
      length++; // Increment to keep count through each element
      current = current.next; // Move on to the next element
    }
    return length;
  }
}

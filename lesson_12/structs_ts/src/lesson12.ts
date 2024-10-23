import { ListNode } from './list_node.js';

export class Lesson12 {

  public gameResult(head: ListNode | null): string {
    let [oddPoints, evenPoints] = [0,0];
    let current = head;
   
   while (current != null && current.next != null) {
      if (current.val > current.next.val) {
        evenPoints++;
      } else if (current.val < current.next.val) {
        oddPoints++;
      }
      current = current.next ? current.next.next || null : null; 
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

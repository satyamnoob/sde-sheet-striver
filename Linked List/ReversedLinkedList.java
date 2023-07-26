public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        //Dummy Way ----------------------------------->
        // Stack<Integer> s = new Stack<>();

        // while(head != null) {
        //     s.push(head.val);
        //     head = head.next;
        // }

        // ListNode newList = new ListNode(Integer.MIN_VALUE);
        // ListNode ptr = newList;

        // while(!s.isEmpty()) {
        //     ptr.next = new ListNode(s.pop());
        //     ptr = ptr.next;
        // }
        
        // return newList.next;

        //Iterative Way --------------------------------->
        // if(head == null || head.next == null) {
        //     return head;
        // }

        // ListNode previous = null;
        // ListNode current = head;

        // while(current != null) {
        //     ListNode next = current.next;
        //     current.next = previous;
        //     previous = current;
        //     current = next;
        // }
        
        // return head = previous;

        //Recursive Way ---------------------------------->
        if(head == null || head.next == null) {
            return head;
        }

        ListNode reversedListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedListHead;
    }
}



// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
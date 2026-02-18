/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even2 = even;
        while((odd != null && odd.next != null) && (even2 != null && even2.next != null) ) {
            odd.next = odd.next.next;
            odd = odd.next;
            //odd.next = even;
            even2.next = even2.next.next;
            even2 = even2.next;
            
        }
        odd.next = even;
        return head;
    }
}
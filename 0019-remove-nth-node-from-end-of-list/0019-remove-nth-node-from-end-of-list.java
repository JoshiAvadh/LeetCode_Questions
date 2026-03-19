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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = n;

        ListNode dummy = new ListNode(-1, head);
        ListNode first = head;
        ListNode sec = dummy;

        while(c > 0) {
            first = first.next;
            c--;
        }   
        while(first != null) {
            first = first.next;
            sec = sec.next;
        }

        sec.next = sec.next.next;

        return dummy.next;
    }
}
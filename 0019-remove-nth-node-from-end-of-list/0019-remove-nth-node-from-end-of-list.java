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
        ListNode temp = head;

        for(int i = 0; i < n; i++){
            temp = temp.next;
        }

        if(temp == null) {
            head = head.next;
            return head;
        }
        ListNode slow = head;
        while(temp.next != null) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
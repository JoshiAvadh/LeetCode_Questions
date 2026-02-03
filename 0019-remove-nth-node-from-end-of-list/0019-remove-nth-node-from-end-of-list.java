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
    public int getSize(ListNode head) {
        int size = 0;
        while(head!= null) {
            head = head.next;
            size++;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return null;
        }
        int sz = getSize(head);
        if(n == sz) {
            head = head.next;
            return head;
        }
        if(n == 1) {
            ListNode curr = head;
            while(curr.next.next!=null) {
                curr = curr.next;
            }
            curr.next = null;
            return head;
        }
        int c = n;
        ListNode first = head;

        while(c > 0) {
            first = first.next;
            c--;
        }
        ListNode second = head;
        while(first.next!=null) {
            second = second.next;
            first = first.next;    
        }
        second.next = second.next.next;
        return head;
    }
}
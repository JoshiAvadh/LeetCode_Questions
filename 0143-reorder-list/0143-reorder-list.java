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

    public ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse2half(ListNode mid) {

        ListNode curr = mid;
        ListNode nxt;
        ListNode prev = null;

        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode LHead = head;
        ListNode left;
        ListNode RHead = reverse2half(mid);
        ListNode right;

        while(LHead != null && RHead != null){
            left = LHead.next;
            right = RHead.next;

            LHead.next = RHead;
            RHead.next = left;
            LHead = left;
            RHead = right;
        }
    }
}
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode leftH = head;
        ListNode rightH = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode next = null;

        while(rightH != null) {
            next = rightH.next;
            rightH.next = prev;
            prev = rightH;
            rightH = next;
        }
        rightH = prev;

        while(leftH != null && rightH != null) {
            if(leftH.val != rightH.val) {
                return false;
            }
            leftH = leftH.next;
            rightH = rightH.next;
        }
        return true;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        int sizeA = 0;
        int sizeB = 0;


        while(tempA.next != null) {
            tempA = tempA.next;
            sizeA++;

        }
        while(tempB.next != null) {
            tempB = tempB.next;
            sizeB++;
        }

        if(tempA != tempB) {
            return null;
        }
        int diff = sizeA - sizeB;

        if(diff >= 0) {
            
            while(diff != 0) {
                pointerA = pointerA.next;
                diff--;
            }
        } else {
            while(diff != 0) {
                pointerB = pointerB.next;
                diff++;
            }
        }

        while(pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        return pointerA;

    }
}
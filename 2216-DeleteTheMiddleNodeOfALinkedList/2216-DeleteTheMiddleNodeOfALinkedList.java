// Last updated: 12/17/2025, 9:12:42 AM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode dummy = head;
        ListNode prev = new ListNode(-1);
        ListNode pt1 = dummy;
        ListNode pt2 = dummy;
        while(pt2 != null && pt2.next != null){
            prev = pt1;
            pt1 = pt1.next;
            pt2 = pt2.next.next;
        }
        prev.next = pt1.next;
        pt1.next = null;
        return dummy;

    }
}
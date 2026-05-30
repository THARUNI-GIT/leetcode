// Last updated: 5/30/2026, 8:01:36 AM
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
    public ListNode middleNode(ListNode head) {
        ListNode dummy = head;
        ListNode pt1 = dummy;
        ListNode pt2 = dummy;
        if(head.next == null) return head;
        if(head.next.next == null) return head.next;
        while(pt2 != null && pt2.next != null){
            pt1 = pt1.next;
            pt2 = pt2.next.next;
        }
        return pt1;
    }
}
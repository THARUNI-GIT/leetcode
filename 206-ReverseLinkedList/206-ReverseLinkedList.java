// Last updated: 8/24/2026, 8:07:55 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ArrayList<Integer> arr = new ArrayList<>();
        dummy = head;
        while(dummy != null){
            arr.add(dummy.val);
            dummy = dummy.next;
        }
        dummy = head;
        for(int i = arr.size()-1; i >= 0; i--){
            dummy.val = arr.get(i);
            dummy = dummy.next;
        }
        return head;

    }
}
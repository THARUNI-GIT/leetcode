// Last updated: 8/24/2026, 8:09:09 PM
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pt1 = dummy;
        ListNode pt2 = dummy;

        for(int i = 0; i < n; i++){
            pt2 = pt2.next;
        }

        while(pt2.next != null){
            pt1 = pt1.next;
            pt2 = pt2.next;
        }

        pt1.next = pt1.next.next;

        return dummy.next;
    }
}

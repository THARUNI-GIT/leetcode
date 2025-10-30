// Last updated: 10/30/2025, 11:44:59 PM
public class Solution {
    public ListNode detectCycle(ListNode head) {
      /*  HashMap<ListNode, Boolean> hmap = new HashMap<>();
        ListNode temp = head;

        while (temp != null) {
            if (hmap.containsKey(temp)) {
                return temp;  // Cycle entry found
            } else {
                hmap.put(temp, true);
            }
            temp = temp.next;
        }
        return null; // No cycle*/
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
               while(slow !=  fast){
            slow = slow.next;
            fast = fast.next;;
        }
        return slow;
            }
        }
        if (fast == null || fast.next == null) return null;
       
        return null;
    }
}
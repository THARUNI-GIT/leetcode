// Last updated: 8/24/2026, 8:07:48 PM
import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        // Handle edge cases: empty or single node lists are palindromes
        if (head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        // 1. Find the middle and push the first half to the stack
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Handle odd length lists: skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // 3. Compare the stack (first half) with the rest of the list
        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}


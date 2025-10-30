// Last updated: 10/30/2025, 11:43:47 PM
import java.util.*;

class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        int[] minCharFromHere = new int[n];
        minCharFromHere[n - 1] = s.charAt(n - 1);
        
        // Build suffix min character array
        for (int i = n - 2; i >= 0; i--) {
            minCharFromHere[i] = Math.min(s.charAt(i), minCharFromHere[i + 1]);
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));
            
            // Try to pop from stack while it's the optimal choice
            while (!stack.isEmpty() && stack.peek() <= minCharFromHere[i == n - 1 ? i : i + 1]) {
                result.append(stack.pop());
            }
        }

        // Pop any remaining characters in the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}

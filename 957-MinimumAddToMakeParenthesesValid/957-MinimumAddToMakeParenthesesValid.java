// Last updated: 5/30/2026, 8:01:35 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;   // count of '('
        int add = 0;    // additions needed

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++; // need an extra '('
                }
            }
        }

        return add + open; // unmatched '(' need ')'
    }
}

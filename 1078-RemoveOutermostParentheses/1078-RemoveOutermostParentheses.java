// Last updated: 10/30/2025, 11:44:26 PM
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) ans.append(c); 
                count++;
            } else {
                count--;
                if (count > 0) ans.append(c); 
            }
        }

        return ans.toString();
    }
}
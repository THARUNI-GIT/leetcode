// Last updated: 12/27/2025, 8:41:59 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int open = 0;   // count of '('
4        int add = 0;    // additions needed
5
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                open++;
9            } else {
10                if (open > 0) {
11                    open--;
12                } else {
13                    add++; // need an extra '('
14                }
15            }
16        }
17
18        return add + open; // unmatched '(' need ')'
19    }
20}
21
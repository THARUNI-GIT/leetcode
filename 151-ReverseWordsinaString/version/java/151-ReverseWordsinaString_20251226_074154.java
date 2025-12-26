// Last updated: 12/26/2025, 7:41:54 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        StringBuilder res = new StringBuilder();
5
6        for (int i = words.length - 1; i >= 0; i--) {
7            res.append(words[i]);
8            if (i != 0) {
9                res.append(" ");
10            }
11        }
12
13        return res.toString().trim();
14    }
15}
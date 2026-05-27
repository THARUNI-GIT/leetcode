// Last updated: 5/27/2026, 11:58:07 AM
1class Solution {
2
3    public boolean isAnagram(String s, String t) {
4
5        if(s.length() != t.length()) {
6            return false;
7        }
8
9        HashMap<Character,Integer> map = new HashMap<>();
10
11        for(int i = 0; i < s.length(); i++) {
12
13            char ch = s.charAt(i);
14
15            map.put(ch,
16                    map.getOrDefault(ch,0) + 1);
17        }
18
19        for(int i = 0; i < t.length(); i++) {
20
21            char ch = t.charAt(i);
22
23            if(!map.containsKey(ch)
24               || map.get(ch) == 0) {
25
26                return false;
27            }
28
29            map.put(ch, map.get(ch) - 1);
30        }
31
32        return true;
33    }
34}
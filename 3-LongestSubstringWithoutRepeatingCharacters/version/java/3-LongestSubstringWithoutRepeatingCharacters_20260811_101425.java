// Last updated: 8/11/2026, 10:14:25 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int count = 0;
4        int MaxCount = 0;
5        for(int i = 0; i < s.length(); i++){
6            HashSet<Character> set = new HashSet<>();
7            count = 0;
8            for(int j = i; j < s.length(); j++){
9                char ch = s.charAt(j);
10                if(!set.contains(ch)){
11                    set.add(ch);
12                    count++;
13                }
14                else{
15                    set.clear();
16                    break;
17                }
18            }
19            MaxCount = Math.max(count,MaxCount);
20
21        }
22        return MaxCount;
23    }
24}
// Last updated: 8/11/2026, 10:43:05 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int count = 0;
4        int windowCount = 0;
5        int left = 0;
6        int right = 0;
7        HashMap<Character,Integer> map = new HashMap<>();
8        for(int i = 0; i < s.length(); i++){
9            char ch = s.charAt(i);
10            right++;
11            if(!map.containsKey(ch)){
12                map.put(ch,i);
13            }
14            else{
15                left = Math.max(left, map.get(ch) + 1);
16                map.put(ch,i);
17            }
18            windowCount = right-left;
19            count = Math.max(count,windowCount);
20            
21        }
22        return count;
23    }
24}
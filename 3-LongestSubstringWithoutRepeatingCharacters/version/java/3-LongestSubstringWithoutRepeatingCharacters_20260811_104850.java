// Last updated: 8/11/2026, 10:48:50 AM
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
15                // check this condition(i missed this)
16                // for example: abba: the left is initially 0,
17                // when we reach 2nd b, left becomes 2,
18                // but when we reach the 2nd a, we are making left as 1
19                // if the code is left = map.get(ch)+1
20                //so, we have the consider the max of existing
21                // left and map.get(ch)+1
22                left = Math.max(left, map.get(ch) + 1);
23                map.put(ch,i);
24            }
25            windowCount = right-left;
26            count = Math.max(count,windowCount);
27            
28        }
29        return count;
30    }
31}
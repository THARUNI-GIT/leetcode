// Last updated: 5/27/2026, 12:25:51 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i = 0; i < s.length(); i++){
5            char ch = s.charAt(i);
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        for(int i = 0; i < s.length(); i++){
9            char ch = s.charAt(i);
10            if(map.get(ch) == 1){return i;}      
11            }
12            return -1;
13    }
14}
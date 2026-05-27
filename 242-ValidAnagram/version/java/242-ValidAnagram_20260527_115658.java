// Last updated: 5/27/2026, 11:56:58 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        if(s.length() != t.length()) return false;
5        for(int i = 0; i < s.length(); i++){
6            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
7        }
8        for(int i = 0; i < t.length(); i++){
9            if(!map.containsKey(t.charAt(i))) return false;
10            else{
11                if(map.get(t.charAt(i)) == 0) return false;
12               else{
13 map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
14               }
15            }
16            }
17            return true;
18        }
19    }
20
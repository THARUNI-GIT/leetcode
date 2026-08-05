// Last updated: 8/5/2026, 10:51:56 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int count = 0;
4        int maxCount = 0;
5        HashSet<Character> set = new HashSet<>(Set.of('a','e','i','o','u'));
6        for(int i = 0; i < k; i++){
7            if(set.contains(s.charAt(i))){
8                count++;
9            }
10            maxCount = count;
11        }
12
13        for(int i = k; i < s.length(); i++){
14            if(set.contains(s.charAt(i-k))){
15                count--;
16            }
17            if(set.contains(s.charAt(i))){
18                count++;
19            }
20            maxCount = Math.max(count,maxCount);
21        }
22        return maxCount;
23    }
24}
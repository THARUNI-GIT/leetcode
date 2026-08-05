// Last updated: 8/5/2026, 10:59:48 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int count = 0;
4        int maxCount = 0;
5        for(int i = 0; i < k; i++){
6            if(isVowel(s.charAt(i))){
7                count++;
8            }
9            maxCount = count;
10        }
11
12        for(int i = k; i < s.length(); i++){
13            if(isVowel(s.charAt(i-k))){
14                count--;
15            }
16            if(isVowel(s.charAt(i))){
17                count++;
18            }
19            maxCount = Math.max(count,maxCount);
20
21            //great optimization...coz highest maxvalue can be k
22            if(maxCount == k){
23                return k;
24            }
25        }
26        return maxCount;
27    }
28
29    public boolean isVowel(char ch){
30        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
31            return true;
32        }
33        return false;
34    }
35
36}
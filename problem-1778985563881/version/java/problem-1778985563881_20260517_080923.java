// Last updated: 5/17/2026, 8:09:23 AM
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i  = 0; i < s.length()-1; i++){
4            int dig1 = s.charAt(i)-'0';
5            int dig2 = s.charAt(i+1)-'0';
6            if(Math.abs(dig1-dig2)>2){
7                return false;
8            }
9        }
10        return true;
11    }
12}
// Last updated: 1/21/2026, 6:01:54 PM
1class Solution {
2    public void reverseString(char[] s) {
3        if(s.length == 1){
4            return;
5        }
6        int pt1 = 0;
7        int pt2 = s.length-1;
8        while(pt1 <= pt2){
9            char temp = s[pt1];
10            s[pt1] = s[pt2];
11            s[pt2] = temp;
12            pt1++;
13            pt2--;
14        }
15
16    }
17}
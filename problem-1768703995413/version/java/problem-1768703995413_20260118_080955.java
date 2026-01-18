// Last updated: 1/18/2026, 8:09:55 AM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        char[] arr = s.toCharArray();
4        int score = 0;
5        int c = 0;
6        int v = 0;
7        for(int i = 0; i < arr.length; i++){
8            if(arr[i] >= 'a' && arr[i] <= 'z'){
9            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u'){
10                c++;
11            }
12            else{
13                v++;
14            }
15        }}
16        if(c == 0) return 0;
17        else{
18            score = Math.floorDiv(v,c);
19        }
20        return score;
21    }
22}
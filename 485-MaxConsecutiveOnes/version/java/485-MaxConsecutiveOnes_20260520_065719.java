// Last updated: 5/20/2026, 6:57:19 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] arr) {
3          int count = 0;
4        int maxcount = 0;
5        for(int i = 0; i < arr.length; i++){
6            if(arr[i]== 0){
7                count = 0;
8            }
9            else{
10                count++;
11            }
12            maxcount = Math.max(count,maxcount);
13        }
14        return maxcount;
15    }
16}
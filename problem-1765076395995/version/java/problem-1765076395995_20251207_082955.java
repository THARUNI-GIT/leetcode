// Last updated: 12/7/2025, 8:29:55 AM
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        int n = nums.length;
4        int[][] reflectionarr = new int[n][2];
5        
6        for(int i = 0; i < n; i++){
7            reflectionarr[i][0] = findReflectionElement(nums[i]);
8            reflectionarr[i][1] = nums[i];
9        }
10        
11        Arrays.sort(reflectionarr,(a,b)->{
12            if(a[0] == b[0]) return a[1] - b[1];
13            return a[0]-b[0];
14        });
15        
16        int[] ans = new int[n];
17        for(int i = 0; i < n; i++){
18            ans[i] = reflectionarr[i][1];
19        }
20        
21        return ans;
22        
23    }
24    int findReflectionElement(int num){
25        int rev = 0;
26        while(num > 0){
27            rev = (rev << 1) | (num & 1);
28            num >>= 1;
29        }
30        return rev;
31    }
32}
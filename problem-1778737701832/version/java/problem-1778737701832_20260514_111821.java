// Last updated: 5/14/2026, 11:18:21 AM
1class Solution {
2    public boolean isGood(int[] nums) {
3        Arrays.sort(nums);
4        if(nums.length == 1) return false;
5        int p1 = nums.length-2;
6        int p2 = nums.length-1;
7        if(nums[p1] != nums[p2]) return false;
8        int num = 1;
9        for(int i = 0; i < nums.length-1; i++){
10            if(nums[i] != num){
11                return false;
12            }
13            num++;
14        }
15        return true;
16    }
17}
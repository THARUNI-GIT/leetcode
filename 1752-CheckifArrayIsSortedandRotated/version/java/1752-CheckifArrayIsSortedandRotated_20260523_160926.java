// Last updated: 5/23/2026, 4:09:26 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4
5        for(int i = 0; i < nums.length; i++) {
6            if(nums[i] > nums[(i + 1) % nums.length]) {
7                count++;
8            }
9        }
10
11        return count <= 1;
12    }
13}
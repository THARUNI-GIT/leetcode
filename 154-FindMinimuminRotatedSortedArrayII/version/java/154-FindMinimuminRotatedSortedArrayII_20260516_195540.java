// Last updated: 5/16/2026, 7:55:40 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        for(int i = 0; i < nums.length; i++){
5            ans = Math.min(ans,nums[i]);
6        }
7        return ans;
8    }
9}
// Last updated: 12/17/2025, 8:34:09 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> hset = new HashSet<>();
4        for(int i = 0; i < nums.length; i++){
5            if(hset.contains(nums[i])){
6                return nums[i];
7            }
8            hset.add(nums[i]);
9        }
10        return -1;
11    }
12}
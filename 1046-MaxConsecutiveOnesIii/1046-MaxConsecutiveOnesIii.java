// Last updated: 5/30/2026, 8:01:33 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int zeroes = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) zeroes++;
            while(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            max = Math.max(i-left+1,max);
        }
        return max;
    }
}
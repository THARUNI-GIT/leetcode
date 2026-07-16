// Last updated: 7/16/2026, 11:05:08 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int lsum = 0;
        for(int i = 0; i < nums.length; i++){
            left[i] = lsum;
            lsum += nums[i];
        }
        int rsum = 0;
        for(int i = nums.length-1; i >= 0; i--){
            right[i] = rsum;
            rsum += nums[i];
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = Math.abs(left[i]-right[i]);
        }
        return result;
    }
}
// Last updated: 10/30/2025, 11:44:50 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        for(int i = 0; i < nums.length; i++){
            sum1 += nums[i];
        }
        int n = nums.length;
        return n*(n+1)/2 - sum1;
        
    }
}
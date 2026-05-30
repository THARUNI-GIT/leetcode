// Last updated: 5/30/2026, 8:01:44 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max_sum = Integer.MIN_VALUE;
        int window_sum = 0;
        for(int i = 0; i < k; i++){
            window_sum += nums[i];
        }
        max_sum = window_sum;
        for(int j = k; j < n; j++){
            window_sum = window_sum - nums[j-k]+nums[j];
            if(window_sum > max_sum){
                max_sum = window_sum;
            }
        }
        return (double)max_sum/k;
    }
}
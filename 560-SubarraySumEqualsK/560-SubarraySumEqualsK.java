// Last updated: 5/30/2026, 8:01:46 AM
class Solution {
    public int subarraySum(int[] nums, int K) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == K) count++;                
            }
        }
        return count;
    }
}
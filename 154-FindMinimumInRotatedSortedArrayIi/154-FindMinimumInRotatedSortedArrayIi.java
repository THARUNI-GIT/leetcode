// Last updated: 8/24/2026, 8:08:11 PM
class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            ans = Math.min(ans,nums[i]);
        }
        return ans;
    }
}
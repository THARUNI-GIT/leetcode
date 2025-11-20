// Last updated: 11/20/2025, 10:42:45 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        for(int i = nums.length; i < 2*nums.length; i++){
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
}
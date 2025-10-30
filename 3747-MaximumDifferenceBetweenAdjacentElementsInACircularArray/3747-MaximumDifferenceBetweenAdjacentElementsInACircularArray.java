// Last updated: 10/30/2025, 11:43:10 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Math.abs(nums[nums.length-1]-nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(Math.abs(nums[i-1]-nums[i])> diff){
                diff = Math.abs(nums[i-1]-nums[i]);
            }
        }
        return diff;
    }
}
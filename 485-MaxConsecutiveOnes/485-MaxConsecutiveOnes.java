// Last updated: 11/20/2025, 10:43:09 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int[] prefix = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum++;
            }
            else{
                sum = 0;
            }
            prefix[i] = sum;
        }
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < prefix[i]){
                max = prefix[i];
            }
        }
        return max;
    }
}
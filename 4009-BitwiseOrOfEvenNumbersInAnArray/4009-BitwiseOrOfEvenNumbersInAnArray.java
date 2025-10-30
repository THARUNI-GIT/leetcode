// Last updated: 10/30/2025, 11:43:03 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result = result | nums[i];
            }
        }
        return result;
    }
}
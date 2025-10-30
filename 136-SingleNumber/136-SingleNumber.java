// Last updated: 10/30/2025, 11:45:02 PM
class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = nums[i] ^ num;
        }
        return num;
    }
}
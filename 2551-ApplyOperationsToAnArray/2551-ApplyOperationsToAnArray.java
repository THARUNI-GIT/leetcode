// Last updated: 10/30/2025, 11:43:44 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int pt1 = 0;
        int pt2 = 1;
        while(pt1 < n && pt2 < n){
            if(nums[pt1] == nums[pt2]){
                nums[pt1] *= 2;
                nums[pt2] = 0;
            }
            pt1++;
            pt2++;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i = count; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
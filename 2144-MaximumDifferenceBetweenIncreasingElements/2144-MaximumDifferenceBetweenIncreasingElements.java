// Last updated: 10/30/2025, 11:44:06 PM
class Solution {
    public int maximumDifference(int[] nums) {
       /* int diff = -1;
        int pt1 = 0;
        int pt2 = nums.length-1;
        while(pt1 <= pt2){
            if(nums[pt1] > nums[pt2]){
                pt1++;
            }
            else if(nums[pt1] < nums[pt2]){
                diff = Math.max(diff, nums[pt1]-nums[pt2]);
                pt2--;
                pt1++;
            }
        }
        return diff;*/
        int min = nums[0];
        int diff = -1;
        for(int i = 0; i < nums.length; i++){
            if(min < nums[i]){
                diff = Math.max(diff, nums[i] - min);
            }
            else{
                min = nums[i];
            }
        }
        return diff;
    }

}
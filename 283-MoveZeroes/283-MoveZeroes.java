// Last updated: 10/30/2025, 11:44:48 PM
class Solution {
    public void moveZeroes(int[] nums) {
       /* if(nums.length <= 1){

        }
        else{
            int pt1 = 0;
            int pt2 = 1;
            while(pt1 < nums.length && pt2 < nums.length){
                if(nums[pt1] == 0 && nums[pt2] == 0){
                    pt2++;
                }
                else if(nums[pt1] == 0 && nums[pt2] != 0){
                    nums[pt1] = nums[pt2];
                    nums[pt2] = 0;
                    pt2++;
                    pt1++;
                }
                else {
                    pt1++;
                    pt2++;
                }
            }
        }*/

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[res] = nums[i];
                res++;
            }
        }
        for(int i = res; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
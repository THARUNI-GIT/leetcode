// Last updated: 5/30/2026, 8:00:34 AM
class Solution {
    public int minimumSwaps(int[] nums) {
        int pt1 = 0;
        int pt2 = nums.length-1;
        int count = 0;
        while(pt2 > pt1){

            if(nums[pt1] != 0){
                pt1++;
            }
            else if(nums[pt2] == 0){
                pt2--;
            }
            
            else{
                count++;
                pt1++;
                pt2--;
            }
           
            
        }
        return count;
    }
}
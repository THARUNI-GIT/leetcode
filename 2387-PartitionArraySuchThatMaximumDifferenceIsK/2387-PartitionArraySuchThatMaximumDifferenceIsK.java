// Last updated: 10/30/2025, 11:43:51 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        int val = 1;
        Arrays.sort(nums);
        int pt1 = 0;
        int pt2 = 1;
        if(nums.length < 2) return val;
        
        while(pt2 < nums.length){
            if(nums[pt2]-nums[pt1] <= k){
                pt2++;
            }
            else{
                val++;
                pt1 = pt2;
                pt2++;
            }
        }
        return val;
    }
}
// Last updated: 5/30/2026, 8:01:39 AM
class Solution {
    public int pivotIndex(int[] nums) {
     int prefix = 0;
     int sum = 0;
     for(int i = 0; i < nums.length; i++){
        sum += nums[i];
     }  
     int suffix = sum;
     for(int i = 0; i < nums.length; i++){
        prefix = sum-suffix;
        suffix = suffix-nums[i];
        if(prefix == suffix){
            return i;
        }
     }
     return -1;
    }
}
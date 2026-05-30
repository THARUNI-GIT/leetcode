// Last updated: 5/30/2026, 8:01:00 AM
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) return false;
        int p1 = nums.length-2;
        int p2 = nums.length-1;
        if(nums[p1] != nums[p2]) return false;
        int num = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != num){
                return false;
            }
            num++;
        }
        return true;
    }
}
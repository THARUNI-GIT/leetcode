// Last updated: 5/30/2026, 8:01:21 AM
class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }
}
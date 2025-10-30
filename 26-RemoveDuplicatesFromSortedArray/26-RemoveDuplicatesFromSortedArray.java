// Last updated: 10/30/2025, 11:45:14 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int pt1 = 0;
        int pt2 = 1;
        
        while (pt2 < nums.length) {
            if (nums[pt2] != nums[pt1]) {
                pt1++;
                nums[pt1] = nums[pt2];
            }
            pt2++;
        }

        return pt1 + 1;
    }
}

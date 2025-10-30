// Last updated: 10/30/2025, 11:45:12 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                high = mid - 1; // Search in left half
            } else {
                low = mid + 1; // Search in right half
            }
        }

        return low;
    }
}

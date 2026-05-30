// Last updated: 5/30/2026, 8:01:41 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int i = 0;
        int prod = 1;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            prod *= nums[j];

            while (prod >= k) {
                prod /= nums[i];
                i++;
            }

            count += (j - i + 1);
        }

        return count;
    }
}

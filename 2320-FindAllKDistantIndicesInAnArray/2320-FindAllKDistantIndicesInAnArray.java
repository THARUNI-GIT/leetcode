// Last updated: 10/30/2025, 11:43:53 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> index = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    index.add(i);
                    break; 
                }
            }
        }
        return index;
    }
}
// Last updated: 11/20/2025, 10:42:50 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int pt1 = 0;
        int pt2 = n;
        int i = 0;
      while(pt1 < n && pt2 < nums.length){
            ans[i] = nums[pt1];
            ans[i+1] = nums[pt2];
            pt1++;
            pt2++;
            i+=2;
        }
        return ans;
    }
}
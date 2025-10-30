// Last updated: 10/30/2025, 11:44:57 PM
class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        swap(0,nums.length-1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
        return;
    }

    public static void swap(int i, int j , int[] nums){
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return;
    }
}
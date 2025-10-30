// Last updated: 10/30/2025, 11:44:51 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixarr = new int[n];
        int[] suffixarr = new int[n];
        
        // prefix
        prefixarr[0] = 1;
        for(int i = 1; i < n; i++){
            prefixarr[i] = prefixarr[i-1] * nums[i-1];
        }
        
        // suffix
        suffixarr[n-1] = 1;
        for(int j = n-2; j >= 0; j--){
            suffixarr[j] = suffixarr[j+1] * nums[j+1];
        }
        
        // result
        for(int k = 0; k < n; k++){
            nums[k] = prefixarr[k] * suffixarr[k];
        }
        
        return nums;
    }
}

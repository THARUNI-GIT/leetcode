// Last updated: 12/17/2025, 9:12:06 AM
class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        int[][] reflectionarr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            reflectionarr[i][0] = findReflectionElement(nums[i]);
            reflectionarr[i][1] = nums[i];
        }
        
        Arrays.sort(reflectionarr,(a,b)->{
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0]-b[0];
        });
        
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = reflectionarr[i][1];
        }
        
        return ans;
        
    }
    int findReflectionElement(int num){
        int rev = 0;
        while(num > 0){
            rev = (rev << 1) | (num & 1);
            num >>= 1;
        }
        return rev;
    }
}
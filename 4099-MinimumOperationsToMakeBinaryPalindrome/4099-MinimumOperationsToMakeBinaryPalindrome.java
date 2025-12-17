// Last updated: 12/17/2025, 9:12:05 AM
class Solution {
    public int[] minOperations(int[] nums) {
        int[] sol = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(isPalindrome(nums[i])){
                sol[i] = 0;
                continue;
            }
            int near = findNearestPalindrome(nums[i]);
            sol[i] = Math.abs(nums[i] - near);
              
        }
        return sol;
    }
    boolean isPalindrome(int num){
        String s = Integer.toBinaryString(num);
        int pt1 = 0;
        int pt2 = s.length()-1;
        while(pt1 < pt2){
            if(s.charAt(pt1) != s.charAt(pt2)){
                return false;
            }
            pt1++;
            pt2--;
        }
        return true;
    }
    
    int findNearestPalindrome(int num){
        for(int diff = 1; ; diff++){
            int lower = num-diff;
            int high = num+diff;
            boolean lowPal = lower >= 0 && isPalindrome(lower);
            boolean highPal = isPalindrome(high);
            if(lowPal) return lower;
            if(highPal) return high;
        }
    }
    
}
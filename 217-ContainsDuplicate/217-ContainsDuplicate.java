// Last updated: 10/30/2025, 11:44:55 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
                set.add(nums[i]);
            
        }
        return false;
    }
}
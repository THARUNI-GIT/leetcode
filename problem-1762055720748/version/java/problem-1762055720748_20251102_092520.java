// Last updated: 11/2/2025, 9:25:20 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list =new ArrayList<Integer>();
        Arrays.sort(nums);
        int val = nums[0];
        int pt = 0;
        while(pt < nums.length){
            if(val == nums[pt]){
                pt++;
            }
        else if(val != nums[pt]){
        list.add(val);
            }
            val++;
        }
            
        
        return list;
    }
}
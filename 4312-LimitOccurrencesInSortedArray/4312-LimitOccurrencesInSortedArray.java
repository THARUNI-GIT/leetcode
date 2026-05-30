// Last updated: 5/30/2026, 8:00:36 AM
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.getOrDefault(nums[i],0) < k){
                list.add(nums[i]);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
}
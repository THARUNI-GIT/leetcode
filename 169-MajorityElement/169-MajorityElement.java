// Last updated: 10/30/2025, 11:44:58 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        double count = Math.floor(nums.length/2);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> mapvalue : hash.entrySet()){
            if(mapvalue.getValue() > count){
                ans = mapvalue.getKey();
            }
        }
        
        return ans;
    }
}
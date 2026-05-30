// Last updated: 5/30/2026, 8:01:05 AM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        long maxsum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size() == k){maxsum = Math.max(sum,maxsum);}
        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i-k];
            map.put(nums[i-k], map.get(nums[i-k]) - 1);
             if(map.get(nums[i-k]) == 0){
                map.remove(nums[i-k]);
            }
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.size() == k){
                maxsum = Math.max(sum,maxsum);
            }
        }
        
return maxsum;
    }
}
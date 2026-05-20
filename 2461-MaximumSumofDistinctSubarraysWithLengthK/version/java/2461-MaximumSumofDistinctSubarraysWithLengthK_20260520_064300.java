// Last updated: 5/20/2026, 6:43:00 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        long sum = 0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        long maxsum = 0;
6        for(int i = 0; i < k; i++){
7            sum += nums[i];
8            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9        }
10        if(map.size() == k){maxsum = Math.max(sum,maxsum);}
11        for(int i = k; i < nums.length; i++){
12            sum += nums[i] - nums[i-k];
13            map.put(nums[i-k], map.get(nums[i-k]) - 1);
14             if(map.get(nums[i-k]) == 0){
15                map.remove(nums[i-k]);
16            }
17            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
18            if(map.size() == k){
19                maxsum = Math.max(sum,maxsum);
20            }
21        }
22        
23return maxsum;
24    }
25}
// Last updated: 8/3/2026, 3:37:35 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        //brute approach
4        //calculate the sum of all subarrays of size k
5        double maxSum = Double.NEGATIVE_INFINITY;
6        for(int i = 0; i <= nums.length-k; i++){
7            int sum = 0;
8            for(int j = i; j < i+k; j++){
9                sum += nums[j];
10            }
11            maxSum = Math.max(sum, maxSum);
12        }
13
14        return (double)(maxSum/k);
15    }
16}
// Last updated: 8/3/2026, 3:38:47 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        //brute approach
4        //calculate the sum of all subarrays of size k
5        double maxSum = Double.NEGATIVE_INFINITY;
6        // HERE if we use Double.MIN_VALUE, we are getting wrong 
7        // ans for negative values, as the value of it is 0.0000000000000
8        // so take it as negative_infinity
9        for(int i = 0; i <= nums.length-k; i++){
10            int sum = 0;
11            for(int j = i; j < i+k; j++){
12                sum += nums[j];
13            }
14            maxSum = Math.max(sum, maxSum);
15        }
16
17        return (double)(maxSum/k);
18    }
19}
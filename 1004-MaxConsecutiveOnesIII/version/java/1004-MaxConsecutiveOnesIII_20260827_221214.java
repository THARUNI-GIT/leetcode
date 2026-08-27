// Last updated: 8/27/2026, 10:12:14 PM
/*
 * This is the optimal solution, solved using Sliding Window Concept..The logic is simple, take a variable zeroes and 2 ptrs, one is left and other is right...start moving right and if nums[right] == 0, then increment the zeroes, continue the traversal of right, till the zeroes>k, then start moving left , until we are less with zeroes <= k, so while moving left, if nums[left] == 0, then decrement the zeroes value, and if zeroes <= k, again start moving the right pointer..meanwhile, take a max value, and compare it with existing max value and the window length and update the max value if right-left > max...do this for the whole array...Here is the algo to remember: Move R forward
 * If nums[R] == 0, increase zeros
 * If zeros <= k → window is valid → update max
 * If zeros > k:
 * Move L forward
 * If nums[L] == 0, decrease zeros
 * Keep doing this until zeros <= k
 * Now continue moving R forward again
*/

1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int l = 0;
4        int r = 0;
5        int zeroes = 0;
6        int max = 0;
7        while( r < nums.length){
8            if(nums[r] == 0) zeroes++;
9           
10            while(zeroes > k){
11                if(nums[l] == 0) zeroes--;
12                l++;
13            }
14             
15            r++;
16            max = Math.max(max,r-l);
17        }
18        return max;
19    }
20}
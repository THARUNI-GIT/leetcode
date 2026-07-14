// Last updated: 7/14/2026, 8:30:05 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length-1;
5        while(low <= high){
6            int mid = low+(high-low)/2;
7            if(nums[mid] == target) return mid;
8            else if(nums[mid] >  target){
9                high = mid-1;
10            }
11            else{
12                low = mid+1;
13            }
14        }
15        return -1;
16    }
17}
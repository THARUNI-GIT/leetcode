// Last updated: 10/30/2025, 11:43:18 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diffarray = new int[nums.length];
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            diffarray[start] += 1;
            if(end+1 < nums.length){
            diffarray[end+1] -= 1;
            }
        }
        //cumsum of the diffarray
        for(int j = 1; j < diffarray.length; j++){
            diffarray[j] += diffarray[j-1];
        }

        for(int k = 0; k < nums.length; k++){
            if(nums[k] - diffarray[k] > 0){
                return false;
            }
        }
        return true;
    }
}
// Last updated: 11/20/2025, 10:43:11 PM
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        HashMap<Integer,int[]> hashmap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int zero = countZero(strs[i]);
            int one = strs[i].length() - zero;
            hashmap.put(i,new int[]{zero,one});
        }
        int largestsubset = 0;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < strs.length; i++){
            int[] arr = hashmap.get(i);
            int zeros = arr[0];
            int ones = arr[1];
            for(int z = m; z >= zeros; z--){
                for(int o = n; o >= ones; o--){
                    dp[z][o] = Math.max(dp[z][o], 1 + dp[z-zeros][o-ones]);
                }
            }
        }
        return dp[m][n];
    }
    public int countZero(String str){
        int count = 0;
        for(char i : str.toCharArray()){
            if(i == '0'){
                count++;
            }
        }
        return count;
    }
}
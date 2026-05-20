// Last updated: 5/20/2026, 7:33:16 AM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int[] freq = new int[A.length + 1];
        int common = 0;
        for(int i = 0; i < A.length; i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2){
                common++;
            }
            freq[B[i]]++;
            if(freq[B[i]] == 2){
                common++;
            }
            ans[i] = common;
        }
        return ans;
    }
}
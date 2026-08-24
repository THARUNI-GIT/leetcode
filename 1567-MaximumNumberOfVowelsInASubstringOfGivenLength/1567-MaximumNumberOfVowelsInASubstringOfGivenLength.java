// Last updated: 8/24/2026, 8:06:14 PM
class Solution {
    public int maxVowels(String s, int k) {
        //using prefix sum

        int[] prefix_sum = new int[s.length()+1];
        prefix_sum[0] = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sum++;
            }
            prefix_sum[i+1] = sum;
        }
        int maxCount = 0;
        for(int i = 0; i < prefix_sum.length-k; i++){
            int val = prefix_sum[i+k]-prefix_sum[i];
            maxCount = Math.max(val,maxCount);
            if(maxCount == k){
                return k;
            }
        }

        return maxCount;
    }
}
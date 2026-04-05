// Last updated: 4/5/2026, 1:39:19 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max_sum = 0;
        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }
        max_sum = sum;
        int pt1 = k-1;
        int pt2 = n-1;
       while(pt1 >= 0){
        sum = sum-cardPoints[pt1]+cardPoints[pt2];
        pt1--;
        pt2--;
        max_sum = Math.max(sum,max_sum);
       }
       return max_sum;
    }
}
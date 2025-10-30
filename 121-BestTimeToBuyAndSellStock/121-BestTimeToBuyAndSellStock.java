// Last updated: 10/30/2025, 11:45:05 PM
class Solution {
    public int maxProfit(int[] prices) {
        /*int maxprofit = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] > prices[i]){
                maxprofit = Math.max(prices[j]-prices[i],maxprofit);
                }
                
            }
        }
        return maxprofit;*/
        int maxprofit = 0;
        int minvalue = prices[0];
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i]-minvalue;
            maxprofit = Math.max(profit, maxprofit);
            minvalue = Math.min(prices[i],minvalue);
        }
        return maxprofit;
    }

}
// Last updated: 8/24/2026, 8:03:12 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int m = prices.length;
        int n = discounts.length;
        double price = 0;
        if(m >= n){
            int i = 0;
            while(i < n){
                price += (prices[m-i-1]*(100-discounts[n-i-1]))/100.0;
                i++;
            }
            i = 0;
            while(i < m-n){
                price += prices[i];
                i++;
            }
        }

        else{
            int i = 0;
            while(i < m){
                price += (prices[m-i-1]*(100-discounts[n-i-1]))/100.0;
                i++;
            }
        }
        return price;
        
    }
}
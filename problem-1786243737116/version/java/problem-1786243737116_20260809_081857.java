// Last updated: 8/9/2026, 8:18:57 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int m = prices.length;
6        int n = discounts.length;
7        double price = 0;
8        if(m >= n){
9            int i = 0;
10            while(i < n){
11                price += (prices[m-i-1]*(100-discounts[n-i-1]))/100.0;
12                i++;
13            }
14            i = 0;
15            while(i < m-n){
16                price += prices[i];
17                i++;
18            }
19        }
20
21        else{
22            int i = 0;
23            while(i < m){
24                price += (prices[m-i-1]*(100-discounts[n-i-1]))/100.0;
25                i++;
26            }
27        }
28        return price;
29        
30    }
31}
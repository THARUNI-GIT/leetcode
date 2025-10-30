// Last updated: 10/30/2025, 11:44:13 PM
/*class Solution {
    public int numWaterBottles(int b, int n) {
        return b + (b - 1) / (n - 1);
    }
}*/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0; // empty bottles
        
        while (numBottles > 0) {
            drinked += numBottles;   // drink all current bottles
            eb += numBottles;        // get empty bottles
            
            numBottles = eb / numExchange; // exchange empties for new bottles
            eb = eb % numExchange;         // leftover empties
        }
        return drinked;
    }
}
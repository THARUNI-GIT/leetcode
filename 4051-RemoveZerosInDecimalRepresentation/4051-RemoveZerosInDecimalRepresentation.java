// Last updated: 10/30/2025, 11:43:01 PM
class Solution {
    public long removeZeros(long n) {
        long placevalue = 1;
        long sum = 0;
        while(n > 0){
            long value = n % 10;
            if(value != 0){
                value = value*placevalue;
                sum += value;
                placevalue = placevalue*10;
            }
            n = n/10;
        }
        return sum;
    }
}
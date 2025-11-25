// Last updated: 11/25/2025, 8:45:26 AM
class Solution {
    public long sumAndMultiply(int n) {
        long sum  = 0;
         long placeval = 1;
        long originalnum = 0;
        while(n > 0){
            long val = n % 10;
            if(val != 0){
                sum += val;
                originalnum += val * placeval;
                placeval *= 10;
            } 
            n = n/10;
        }
       
        
 long ans = (long) (originalnum * sum);
        return ans;
    }
}
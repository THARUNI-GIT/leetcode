// Last updated: 12/17/2025, 9:12:09 AM
class Solution {
    
    public int largestPrime(int n) {
        return findNearestPrime(n);
    }
    
    boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
            for(int i = 3; i*i <= n; i++){
            if(n % i == 0) return false;
            }  
        return true;
    }
    
    int findNearestPrime(int n){
        int sum = 0;
        int ans = 0;
        
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                sum += i;
                if(sum > n) break;
                if(isPrime(sum)) ans = sum;
            }
        }
        return ans;
    }
    
}
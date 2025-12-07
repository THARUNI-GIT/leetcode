// Last updated: 12/7/2025, 8:45:07 AM
1class Solution {
2    
3    public int largestPrime(int n) {
4        return findNearestPrime(n);
5    }
6    
7    boolean isPrime(int n){
8        if(n <= 1) return false;
9        if(n == 2) return true;
10        if(n % 2 == 0) return false;
11            for(int i = 3; i*i <= n; i++){
12            if(n % i == 0) return false;
13            }  
14        return true;
15    }
16    
17    int findNearestPrime(int n){
18        int sum = 0;
19        int ans = 0;
20        
21        for(int i = 2; i <= n; i++){
22            if(isPrime(i)){
23                sum += i;
24                if(sum > n) break;
25                if(isPrime(sum)) ans = sum;
26            }
27        }
28        return ans;
29    }
30    
31}
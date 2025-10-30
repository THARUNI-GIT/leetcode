// Last updated: 10/30/2025, 11:44:45 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n & (n-1)) == 0 &&  n % 3 == 1; 
    }
}
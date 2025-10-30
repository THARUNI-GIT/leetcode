// Last updated: 10/30/2025, 11:44:46 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%3 != 0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
// Last updated: 8/24/2026, 8:08:49 PM
class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int left = 1;
        int right = x/2;
        while(left <= right){
            int mid = left+(right-left)/2;
            long square = (long)mid*mid;
            if(square == x) return mid;
            else if(square < x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            
        }
        return right;        
    }
}
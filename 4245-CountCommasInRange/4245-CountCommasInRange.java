// Last updated: 4/5/2026, 1:38:39 PM
class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n < 1000) return 0;
        else{
            for(int i = 1000; i <= n; i++){
                count += noOfCommas(i);
            }
        }
        return count;
    }
    public int noOfCommas(int n){
        int len = String.valueOf(n).length();
        return (len-1)/3;
    }
}
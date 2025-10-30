// Last updated: 10/30/2025, 11:44:53 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count==1?true:false;
    }
}
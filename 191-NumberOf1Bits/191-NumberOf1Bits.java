// Last updated: 10/30/2025, 11:44:56 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
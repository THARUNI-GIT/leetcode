// Last updated: 11/20/2025, 10:42:05 PM
class Solution {
    public int maxOperations(String s) {
        int[] prefix = new int[s.length()];
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                sum++;
                prefix[i] += sum;
            }
            else{
            prefix[i] = sum;
            }
        }
        int result = 0;
        for(int i = s.length()-1; i >= 1; i--){
            if(s.charAt(i) == '0' && s.charAt(i-1) == '1'){
                result += prefix[i];
            }
        }
        return result;
    }
}
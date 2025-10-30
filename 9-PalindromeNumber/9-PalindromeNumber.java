// Last updated: 10/30/2025, 11:45:18 PM
class Solution {
    public boolean isPalindrome(int x) {
        String str =  String.valueOf(x);
        int idx = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-idx-1)){
                return  false;
            }
            idx++;
        }
        return true;
    }
}
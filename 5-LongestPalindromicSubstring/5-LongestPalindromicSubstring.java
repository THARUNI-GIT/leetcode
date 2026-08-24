// Last updated: 8/24/2026, 8:09:19 PM
class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int size = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String str = s.substring(i,j+1);
                if(isPalindrome(str)){
                    if(size <= str.length()){
                        size = str.length();
                        result = str;
                    }
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String str){
        int pt1 = 0;
        int pt2 = str.length()-1;
        while(pt1 < pt2){
            if(str.charAt(pt1) != str.charAt(pt2)) return false;
            pt1++;
            pt2--;
        }
        return true;
    }
}
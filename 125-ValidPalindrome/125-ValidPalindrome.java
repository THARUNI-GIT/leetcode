// Last updated: 10/30/2025, 11:45:04 PM
class Solution {
    public boolean isPalindrome(String s) {
        int pt1 = 0;
        int pt2 = s.length()-1;
        s = s.toLowerCase();
        while(pt1 <= pt2){
            if(!Character.isLetterOrDigit(s.charAt(pt1))){
                pt1++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(pt2))){
                pt2--;
                continue;
            }
            else if(s.charAt(pt1) != s.charAt(pt2)){
                return false;
            }
            else{
                pt1++;
                pt2--;
            }
        }
        return true;
    }
}
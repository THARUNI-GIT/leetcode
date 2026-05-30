// Last updated: 5/30/2026, 8:00:35 AM
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i  = 0; i < s.length()-1; i++){
            int dig1 = s.charAt(i)-'0';
            int dig2 = s.charAt(i+1)-'0';
            if(Math.abs(dig1-dig2)>2){
                return false;
            }
        }
        return true;
    }
}
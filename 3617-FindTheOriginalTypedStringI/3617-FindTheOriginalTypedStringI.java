// Last updated: 10/30/2025, 11:43:21 PM
class Solution {
    public int possibleStringCount(String word) {
        int extra = 1;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1))
            extra++;
        }
        return extra;
    }
}
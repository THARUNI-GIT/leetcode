// Last updated: 8/24/2026, 8:07:29 PM
class Solution {
    public void reverseString(char[] s) {
        int pt1 = 0;
        int pt2 = s.length-1;
        while(pt2 >= pt1){
            char temp = s[pt1];
            s[pt1++] = s[pt2];
            s[pt2--] = temp;
        }
    }
}
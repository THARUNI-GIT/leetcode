// Last updated: 10/30/2025, 11:43:23 PM
class Solution {
    public char kthCharacter(int k) {
       /* StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int size = sb.length();
            for(int i = 0; i < size; i++){
                 sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k-1);*/
        return (char)('a'+Integer.bitCount(k-1));
    }
}
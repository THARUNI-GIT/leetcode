// Last updated: 8/24/2026, 8:07:21 PM
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){return i;}      
            }
            return -1;
    }
}
// Last updated: 8/24/2026, 8:08:05 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet();
        Set repeat = new HashSet();

        for(int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);
            if(!seen.add(sub)) {
                repeat.add(sub);
            }
        }
        return new ArrayList(repeat);
    }
}
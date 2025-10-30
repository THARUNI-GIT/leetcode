// Last updated: 10/30/2025, 11:43:52 PM
class Solution {
    public String largestGoodInteger(String num) {
        String[] numbers = {"999","888","777","666","555","444","333","222","111","000"};
        for (String s : numbers) {
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }
}
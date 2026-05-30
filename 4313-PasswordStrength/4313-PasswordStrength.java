// Last updated: 5/30/2026, 8:00:31 AM
class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int score = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            else{
                set.add(ch);
                if(ch >= 'A' && ch <= 'Z'){
                    score = score+2;
                }
                else if(ch >= 'a' && ch <= 'z'){
                    score = score+1;
                }
                else if(ch >= '0' && ch <= '9'){
                    score = score+3;
                }
                else{
                    score = score+5;
                }
            }
            
        }
        return score;
    }
}
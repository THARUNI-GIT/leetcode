// Last updated: 4/5/2026, 1:38:36 PM
class Solution {
    public int vowelConsonantScore(String s) {
        char[] arr = s.toCharArray();
        int score = 0;
        int c = 0;
        int v = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u'){
                c++;
            }
            else{
                v++;
            }
        }}
        if(c == 0) return 0;
        else{
            score = Math.floorDiv(v,c);
        }
        return score;
    }
}
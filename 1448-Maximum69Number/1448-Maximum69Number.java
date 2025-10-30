// Last updated: 10/30/2025, 11:44:21 PM
import java.util.ArrayList;

class Solution {
    public int maximum69Number (int num) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        // Extract digits (in reverse order)
        while(num > 0){
            int val = num % 10;
            list.add(val);
            num = num / 10;
        }
        
        // Change first 6 (from left) to 9
        for(int i = list.size()-1; i >= 0; i--){
            if(list.get(i) == 6){
                list.set(i, 9);   // ✅ fixed here
                break;
            }
        }
        
        // Rebuild number
        int place = 1;
        for(int j = 0; j < list.size(); j++){  // ✅ go from 0 upward, since digits are reversed
            sum += list.get(j) * place;
            place *= 10;
        }
        
        return sum;
    }
}

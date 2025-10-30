// Last updated: 10/30/2025, 11:43:33 PM
import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int max = 0;   // track maximum frequency
        int freq = 0;  // track sum of elements with max frequency
        
        for(int num : nums){
            int count = hmap.getOrDefault(num, 0) + 1;
            hmap.put(num, count);
            
            if(count > max){
                // found a new max, reset freq
                max = count;
                freq = count;
            } 
            else if(count == max){
                // another element also has the same max frequency
                freq += count;
            }
        }
        
        return freq;
    }
}

// Last updated: 7/16/2026, 11:04:29 AM
class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n > 0){
            int digit = n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n = n/10;
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            int key = i.getKey();
            int val = i.getValue();
            sum += key*val;
        }
        return sum;
    }
}
// Last updated: 5/31/2026, 8:07:47 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        while(n > 0){
5            int digit = n%10;
6            map.put(digit,map.getOrDefault(digit,0)+1);
7            n = n/10;
8        }
9        int sum = 0;
10        for(Map.Entry<Integer,Integer> i:map.entrySet()){
11            int key = i.getKey();
12            int val = i.getValue();
13            sum += key*val;
14        }
15        return sum;
16    }
17}
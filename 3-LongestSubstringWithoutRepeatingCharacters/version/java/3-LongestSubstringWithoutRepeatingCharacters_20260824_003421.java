// Last updated: 8/24/2026, 12:34:21 AM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        if(s.length() < 10){
4                    List<String> list = new ArrayList<String>();
5                    return list;
6        }
7        List<String> list = new ArrayList<String>();
8        HashMap<String,Integer> map = new HashMap<>();
9        int end = 10;
10        int start = 0;
11        while(end <= s.length()){
12            String str = s.substring(start,end);
13            map.put(str,map.getOrDefault(str,0)+1);
14            if(map.get(str) > 1){
15                if(!list.contains(str)){
16                list.add(str);
17                }
18            }
19            start++;
20            end++;
21        }
22        return list;
23        
24}
25}
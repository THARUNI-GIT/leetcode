// Last updated: 10/30/2025, 11:43:09 PM
class Solution {
    public int maxDifference(String s) {
       /* HashMap<Character, Integer> hmap = new HashMap<>();
        int odd = 0;
        int even = s.length();
       for (int i = 0; i < s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
            else{
                hmap.put(s.charAt(i),1);
            }
        }
        for(Integer i : hmap.values()){
            if(i % 2 == 0 && i < even){
                even = i;
            }
            else if(i % 2 != 0 && i > odd){
                odd = i;
            }        
    }
    int ans = odd-even;
    return ans;*/
    int[] arr = new int[26];
    for(char c : s.toCharArray()){
        arr[c-'a']++;
    }
    int maxodd = 0;
    int mineven = s.length();
    for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0 && arr[i] != 0) mineven = Math.min(arr[i],mineven);
        else if(arr[i] % 2 != 0) maxodd = Math.max(arr[i],maxodd);
    }
    return maxodd-mineven;
}

}
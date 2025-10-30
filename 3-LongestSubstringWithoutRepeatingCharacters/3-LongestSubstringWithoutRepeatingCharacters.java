// Last updated: 10/30/2025, 11:45:20 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        HashSet<Character> hset = new HashSet<>();
        while(i < arr.length){
            int tempcount = 0;
            hset.clear();
            for(int k = i; k < arr.length; k++){
                if(hset.contains(arr[k])){
                    break;
                }
                else{
                hset.add(arr[k]);
                tempcount++;
                } 
            }
            count = Math.max(count,tempcount);
            i++;
        }
        return count;
    }
}
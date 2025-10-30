// Last updated: 10/30/2025, 11:44:23 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
     List<String> result = new ArrayList<>();
     result.add(words[0]);
     for(int i = 0; i < words.length; i++){
        char[] charArray = words[i].toCharArray();
        char[] existingarr = result.get(result.size()-1).toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(existingarr);
        if(!Arrays.equals(charArray,existingarr)){
            result.add(words[i]);
        }
     }
     return result;

    }
}
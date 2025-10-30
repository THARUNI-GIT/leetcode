// Last updated: 10/30/2025, 11:43:37 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(10);
        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
}
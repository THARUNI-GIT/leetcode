// Last updated: 10/30/2025, 11:44:19 PM
class Solution {
    public int findLucky(int[] arr) {
        int num = -1;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i : arr){
            if(hmap.containsKey(i)){
                hmap.put(i,hmap.get(i)+1);
            }
            else{
                hmap.put(i,1);
            }
        }
        for(int key : hmap.keySet()){
            if(hmap.get(key) == key){
                num = Integer.max(num,key);
            }
        }
        return num;
    }
}
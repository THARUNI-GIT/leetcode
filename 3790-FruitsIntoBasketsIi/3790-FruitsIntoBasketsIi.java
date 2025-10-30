// Last updated: 10/30/2025, 11:43:04 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < fruits.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = -1;
                    count++;
                    break;
                }
            }
        }
        int val = fruits.length-count;
        return val;
    }
}
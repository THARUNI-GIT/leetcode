// Last updated: 10/30/2025, 11:43:29 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
      /*  int fullbottles = 0;
        int empty = numBottles;
        int bottlesdrunk = numBottles;
        while(fullbottles >= 0 && empty >= numExchange){
            while(empty >= numExchange){
                empty = empty-numExchange;
                numExchange++;
                fullbottles++;
            }
            while(fullbottles > 0){
                bottlesdrunk++;
                fullbottles--;
                empty++;
            }
        }
        return bottlesdrunk;*/
        int full = 0;
        int empty = numBottles;
        int bottlesdrunk = numBottles;
        while(empty >= numExchange){
            if(full > 0 && empty < numExchange){
                bottlesdrunk += full;
                empty = full;
                full = 0;
            }
            if(empty >= numExchange){
    empty -= numExchange;
    bottlesdrunk++;   // immediately drink the new bottle
    empty++;          // now it's an empty
    numExchange++;
}

        }
        return bottlesdrunk;
    }
}
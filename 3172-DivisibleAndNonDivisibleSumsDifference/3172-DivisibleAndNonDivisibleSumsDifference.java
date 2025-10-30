// Last updated: 10/30/2025, 11:43:38 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int sum1 = 0;
        int num2 = 0;
        for(int i = 1; i <= n; i++){
            sum1 += i;
            if(i % m == 0){
                num1 += i;
            }
        }
        num2 = sum1-num1;
       return num2-num1; 
    }
}
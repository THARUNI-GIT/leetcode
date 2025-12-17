// Last updated: 12/17/2025, 9:12:08 AM
class Solution {
    public boolean completePrime(int num) {
        if(!isPrime(num)) return false;
        String s = String.valueOf(num);
        int n = s.length();
        
        for(int i = 1; i < n; i++){
        int prefix = Integer.parseInt(s.substring(0,i));
        if(!isPrime(prefix)) return false;
        }
        
        for(int k = 1; k < n; k++){
        int suffix = Integer.parseInt(s.substring(k));
        if(!isPrime(suffix)) return false;
        }
        
    return true;
    }
        
    public boolean isPrime(int num1){
        if(num1 <= 1) return false;
        if(num1 == 2) return true;
        if(num1 % 2 == 0) return false;
        for(int i = 3; i*i <= num1; i++){
            if(num1 % i == 0){
                return false;
            }
        }
        return true;
    }
       public static int[] convertNumberToArray(int number) {
        String numString = String.valueOf(number);
        int length = numString.length();
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numString.charAt(i));
        }
        return digits;
    }
}
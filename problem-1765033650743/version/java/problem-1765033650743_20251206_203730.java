// Last updated: 12/6/2025, 8:37:30 PM
1class Solution {
2    public boolean completePrime(int num) {
3        if(!isPrime(num)) return false;
4        String s = String.valueOf(num);
5        int n = s.length();
6        
7        for(int i = 1; i < n; i++){
8        int prefix = Integer.parseInt(s.substring(0,i));
9        if(!isPrime(prefix)) return false;
10        }
11        
12        for(int k = 1; k < n; k++){
13        int suffix = Integer.parseInt(s.substring(k));
14        if(!isPrime(suffix)) return false;
15        }
16        
17    return true;
18    }
19        
20    public boolean isPrime(int num1){
21        if(num1 <= 1) return false;
22        if(num1 == 2) return true;
23        if(num1 % 2 == 0) return false;
24        for(int i = 3; i*i <= num1; i++){
25            if(num1 % i == 0){
26                return false;
27            }
28        }
29        return true;
30    }
31       public static int[] convertNumberToArray(int number) {
32        String numString = String.valueOf(number);
33        int length = numString.length();
34        int[] digits = new int[length];
35        for (int i = 0; i < length; i++) {
36            digits[i] = Character.getNumericValue(numString.charAt(i));
37        }
38        return digits;
39    }
40}
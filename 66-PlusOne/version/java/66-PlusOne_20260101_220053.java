// Last updated: 1/1/2026, 10:00:53 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4
5        for (int i = n - 1; i >= 0; i--) {
6            if (digits[i] < 9) {
7                digits[i]++;
8                return digits;
9            }
10            digits[i] = 0;
11        }
12
13        // All digits were 9
14        int[] result = new int[n + 1];
15        result[0] = 1;
16        return result;
17    }
18}
19
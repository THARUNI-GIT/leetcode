// Last updated: 4/5/2026, 1:38:38 PM
class Solution {
    public long countCommas(long n) {
        long count = 0;
        long start = 1000;
        int commas = 1;

        while (start <= n) {
            long end = start * 1000 - 1;
            long numbers = Math.min(n, end) - start + 1;

            if (numbers > 0) {
                count += numbers * commas;
            }

            start *= 1000;
            commas++;
        }

        return count;
    }
}
// Last updated: 10/30/2025, 11:43:50 PM
import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m = spells.length;
        int n = potions.length;
        int[] res = new int[m];
        Arrays.sort(potions);

        for (int i = 0; i < m; i++) {
            int spell = spells[i];
            int left = 0, right = n - 1;
            int idx = n; // default if no potion satisfies

            // Binary search for first potion such that spell * potion >= success
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    idx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            res[i] = n - idx; // all from idx to end work
        }
        return res;
    }
}

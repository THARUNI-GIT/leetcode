// Last updated: 4/5/2026, 1:38:55 PM
import java.util.*;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) sum += a;

        Arrays.sort(capacity); 
        int cap = 0;
        int ans = 0;

        for (int i = capacity.length - 1; i >= 0; i--) {
            cap += capacity[i];
            ans++;
            if (cap >= sum) return ans;
        }
        return ans;
    }
}

// Last updated: 12/24/2025, 10:53:40 AM
1import java.util.*;
2
3class Solution {
4    public int minimumBoxes(int[] apple, int[] capacity) {
5        int sum = 0;
6        for (int a : apple) sum += a;
7
8        Arrays.sort(capacity); 
9        int cap = 0;
10        int ans = 0;
11
12        for (int i = capacity.length - 1; i >= 0; i--) {
13            cap += capacity[i];
14            ans++;
15            if (cap >= sum) return ans;
16        }
17        return ans;
18    }
19}
20
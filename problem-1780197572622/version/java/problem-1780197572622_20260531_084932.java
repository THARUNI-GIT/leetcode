// Last updated: 5/31/2026, 8:49:32 AM
1class Solution {
2    public int[] maximumMEX(int[] nums) {
3
4        int n = nums.length;
5        int LIMIT = n + 5;
6
7        int[] freq = new int[LIMIT];
8
9        for (int x : nums) {
10            if (x < LIMIT) {
11                freq[x]++;
12            }
13        }
14
15        TreeSet<Integer> missing = new TreeSet<>();
16
17        for (int i = 0; i < LIMIT; i++) {
18            if (freq[i] == 0) {
19                missing.add(i);
20            }
21        }
22
23        ArrayList<Integer> ans = new ArrayList<>();
24
25        int[] seen = new int[LIMIT];
26        int stamp = 1;
27
28        int i = 0;
29
30        while (i < n) {
31
32            int mex = missing.first();
33
34            if (mex == 0) {
35
36                ans.add(0);
37
38                int x = nums[i];
39
40                if (x < LIMIT) {
41                    freq[x]--;
42                    if (freq[x] == 0) {
43                        missing.add(x);
44                    }
45                }
46
47                i++;
48                continue;
49            }
50
51            int need = mex;
52            int j = i;
53
54            while (need > 0) {
55
56                int x = nums[j];
57
58                if (x < mex && seen[x] != stamp) {
59                    seen[x] = stamp;
60                    need--;
61                }
62
63                if (x < LIMIT) {
64                    freq[x]--;
65
66                    if (freq[x] == 0) {
67                        missing.add(x);
68                    }
69                }
70
71                j++;
72            }
73
74            ans.add(mex);
75
76            stamp++;
77            i = j;
78        }
79
80        int[] res = new int[ans.size()];
81
82        for (int k = 0; k < ans.size(); k++) {
83            res[k] = ans.get(k);
84        }
85
86        return res;
87    }
88}
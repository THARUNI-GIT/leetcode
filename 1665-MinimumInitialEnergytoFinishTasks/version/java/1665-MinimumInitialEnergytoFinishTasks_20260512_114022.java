// Last updated: 5/12/2026, 11:40:22 AM
1class Solution {
2    public int minimumEffort(int[][] t) {
3        Arrays.sort(t, (b,a) -> Integer.compare(a[1]-a[0],b[1]-b[0]));
4        int size = t.length;
5        int initial = 0,sum = 0;
6        int ans = 0;
7        for(int i = 0; i < size; i++){
8           int left = t[i][0];
9           int right = t[i][1];
10            if(initial < right){
11                sum = right-initial;
12                ans += sum;
13                initial += sum-left;
14            }
15            else if(initial >= right){
16                initial -= left;
17            }
18        }
19        return ans;
20    }
21}
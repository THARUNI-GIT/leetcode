// Last updated: 8/9/2026, 8:35:09 AM
1class Solution {
2    public long weightedSum(int[] parent, int[] nums) {
3
4        int n = parent.length;
5
6        // Build children list
7        List<Integer>[] children = new ArrayList[n];
8
9        for (int i = 0; i < n; i++) {
10            children[i] = new ArrayList<>();
11        }
12
13        for (int i = 1; i < n; i++) {
14            children[parent[i]].add(i);
15        }
16
17        int[] depth = new int[n];
18        depth[0] = 1;
19
20        int height = 1;
21
22        // BFS
23        Queue<Integer> queue = new LinkedList<>();
24        queue.offer(0);
25
26        while (!queue.isEmpty()) {
27
28            int node = queue.poll();
29
30            for (int child : children[node]) {
31
32                depth[child] = depth[node] + 1;
33
34                height = Math.max(height, depth[child]);
35
36                queue.offer(child);
37            }
38        }
39
40        long sum = 0;
41
42        for (int i = 0; i < n; i++) {
43            sum += (long) nums[i] * (height - depth[i] + 1);
44        }
45
46        return sum;
47    }
48}
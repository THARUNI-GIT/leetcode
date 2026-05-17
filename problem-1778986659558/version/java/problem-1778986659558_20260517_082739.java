// Last updated: 5/17/2026, 8:27:39 AM
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        double e = 1e-10;
4        int left = (int)Math.ceil(Math.pow(l,1.0/k)-e);
5        int right = (int)Math.floor(Math.pow(r,1.0/k)+e);
6        return Math.max(0,right-left+1);
7    }
8}
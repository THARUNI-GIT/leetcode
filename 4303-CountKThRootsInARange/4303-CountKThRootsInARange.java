// Last updated: 5/30/2026, 8:00:33 AM
class Solution {
    public int countKthRoots(int l, int r, int k) {
        double e = 1e-10;
        int left = (int)Math.ceil(Math.pow(l,1.0/k)-e);
        int right = (int)Math.floor(Math.pow(r,1.0/k)+e);
        return Math.max(0,right-left+1);
    }
}
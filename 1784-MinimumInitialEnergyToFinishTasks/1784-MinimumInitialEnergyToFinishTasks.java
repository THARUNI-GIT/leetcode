// Last updated: 5/30/2026, 8:01:23 AM
class Solution {
    public int minimumEffort(int[][] t) {
        Arrays.sort(t, (b,a) -> Integer.compare(a[1]-a[0],b[1]-b[0]));
        int size = t.length;
        int initial = 0,sum = 0;
        int ans = 0;
        for(int i = 0; i < size; i++){
           int left = t[i][0];
           int right = t[i][1];
            if(initial < right){
                sum = right-initial;
                ans += sum;
                initial += sum-left;
            }
            else if(initial >= right){
                initial -= left;
            }
        }
        return ans;
    }
}
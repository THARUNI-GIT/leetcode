// Last updated: 10/30/2025, 11:45:15 PM
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int pt1 = 0;
        int maxarea = 0;
        int pt2 = n-1;
        while(pt1 < pt2){
            int currArea = Math.min(height[pt1],height[pt2])*(pt2-pt1);
            maxarea = Math.max(maxarea,currArea);
           if(height[pt1] < height[pt2]){
            pt1++;
           }
           else{
            pt2--;
           }
        }
        return maxarea;
    }
}
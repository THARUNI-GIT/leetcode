// Last updated: 12/17/2025, 9:11:40 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int start = matrix[0][0];
4        int end = matrix[0][matrix[0].length-1];
5        if(start <= target && target <= end){
6            return applyBinarySearch(0,matrix[0].length-1,target,matrix);
7        }
8       for(int i = 1; i < matrix.length; i++){
9        start = matrix[i][0];
10        end = matrix[i][matrix[i].length-1];
11        if(start <= target && target <= end){
12            return applyBinarySearch(i,matrix[i].length-1,target,matrix);
13        }
14       } 
15       return false;     
16    }
17    public boolean applyBinarySearch(int pt1, int pt2, int target, int[][] matrix){
18        int low = 0;
19        int high = pt2;
20        while(low <= high){
21            int mid = (low+high)/2;
22        if(matrix[pt1][mid] == target){
23            return true;
24        }
25        if(matrix[pt1][mid] < target){
26            low = mid+1;
27        }
28        else{
29            high = mid-1;
30        }
31        }
32     return false;
33    }
34}
// Last updated: 8/24/2026, 8:08:45 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = matrix[0][0];
        int end = matrix[0][matrix[0].length-1];
        if(start <= target && target <= end){
            return applyBinarySearch(0,matrix[0].length-1,target,matrix);
        }
       for(int i = 1; i < matrix.length; i++){
        start = matrix[i][0];
        end = matrix[i][matrix[i].length-1];
        if(start <= target && target <= end){
            return applyBinarySearch(i,matrix[i].length-1,target,matrix);
        }
       } 
       return false;     
    }
    public boolean applyBinarySearch(int pt1, int pt2, int target, int[][] matrix){
        int low = 0;
        int high = pt2;
        while(low <= high){
            int mid = (low+high)/2;
        if(matrix[pt1][mid] == target){
            return true;
        }
        if(matrix[pt1][mid] < target){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
        }
     return false;
    }
}
// Last updated: 10/30/2025, 11:44:33 PM
class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
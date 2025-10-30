// Last updated: 10/30/2025, 11:45:19 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pt1 = 0;
        int pt2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int idx = 0;
        int[] arr =  new int[n1+n2];
        while(pt1 < n1 && pt2 < n2){
            if(nums1[pt1] <= nums2[pt2]){
                arr[idx] = nums1[pt1];
                pt1++;
                idx++;
            }
            else{
                arr[idx] = nums2[pt2];
                pt2++;
                idx++;
            }
        }
        while(pt1 < n1){
            arr[idx] = nums1[pt1];
            pt1++;
            idx++;
        }
        while(pt2 < n2){
            arr[idx] = nums2[pt2];
            pt2++;
            idx++; 
        }
        if((n1+n2) % 2 != 0){
            int mid = (n1+n2)/2;
            return (double)arr[mid];
        }
        else{
            int mid = (n1+n2)/2;
            return (double) (arr[mid]+arr[mid-1])/2;
        }
       
    }
}
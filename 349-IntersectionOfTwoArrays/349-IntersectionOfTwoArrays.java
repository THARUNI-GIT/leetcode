// Last updated: 10/30/2025, 11:44:44 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pt1 = 0;
        int pt2 = 0;
        HashSet<Integer> hashset = new HashSet<>();
        while(pt1 < nums1.length && pt2 < nums2.length){
            if(nums1[pt1] > nums2[pt2]){
                pt2++;
            }
            else if(nums1[pt1] < nums2[pt2]){
                pt1++;
            }
            else{
                hashset.add(nums1[pt1]);
                pt1++;
                pt2++;
            }
        }
        int[] arr = new int[hashset.size()];
int i = 0;
for (int num : hashset) {
    arr[i++] = num;
}
return arr;
*/

HashSet<Integer> hash1 = new HashSet<>();
for(int num : nums1){
    hash1.add(num);
}
HashSet<Integer> hash2 = new HashSet<>();
for(int num : nums2){
    if(hash1.contains(num)){
        hash2.add(num);
    }
}

int[] arr = new int[hash2.size()];
int i = 0;
for(int num : hash2){
    arr[i++] = num; 
}
return arr;

    }
}
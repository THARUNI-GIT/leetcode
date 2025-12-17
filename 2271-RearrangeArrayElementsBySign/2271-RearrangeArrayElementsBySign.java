// Last updated: 12/17/2025, 9:12:40 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
      /*  int n = nums.length;
       ArrayList<Integer> arr1 = new ArrayList<>();
       ArrayList<Integer> arr2 = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
        if(nums[i] <= 0) arr2.add(nums[i]);
        else arr1.add(nums[i]);
       }
       int i = 1,j = 0;
       int k = 1;
       nums[0] = arr1.get(0);
       while(i < arr1.size() && j < arr2.size() && k < n){
        if(k % 2 == 0) {
            nums[k] = arr1.get(i);
            i++;}
        else{
            nums[k] = arr2.get(j);
            j++;
        }
        k++;
       }
       while(i < arr1.size()){
        nums[k] = arr1.get(i);
        i++;k++;
       }
       while(j < arr2.size()){
        nums[k] = arr2.get(j);
        j++;k++;
       }
return nums;*/
int[] arr = new int[nums.length];
int pi = 0;
int ni = 1;
for(int i = 0; i < nums.length; i++){
    if(nums[i] >= 0){
        arr[pi] = nums[i];
        pi += 2;
    }
    if(nums[i] < 0){
        arr[ni] = nums[i];
        ni += 2;
    }
}
return arr;

    }
}
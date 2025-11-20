// Last updated: 11/20/2025, 10:42:33 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        /*Arrays.sort(nums);
        int val = original;
        while(val != Integer.MAX_VALUE){
            if(search(nums,val)){
                val *= 2;
            }
            else{
                return val;
            }
        }
        return 0;
    }
    boolean search(int[] nums, int num){
        int low = 0; 
        int high = nums.length-1;
        int mid = low+ ((high-low)/2);
        while(low < high){
            if(nums[mid] == num){
                return true;
            }
            else if(nums[mid] < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
*/
HashSet<Integer> hset = new HashSet<>();
for(int i = 0 ; i < nums.length; i++){
hset.add(nums[i]);
}
int val = original;
while(val != Integer.MAX_VALUE){
    if(hset.contains(val)){
        val *= 2;
    }
    else{
        return val;
    }
}
return 0;









    }
}
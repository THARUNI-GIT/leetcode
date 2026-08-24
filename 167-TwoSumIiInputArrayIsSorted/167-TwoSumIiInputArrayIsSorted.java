// Last updated: 8/24/2026, 8:08:09 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] arr = new int[2];
        int i = 0;
        int j = n-1;
        while(i < n && j >= 0 && i < j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
            else if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
        }
        return arr;
    }
}
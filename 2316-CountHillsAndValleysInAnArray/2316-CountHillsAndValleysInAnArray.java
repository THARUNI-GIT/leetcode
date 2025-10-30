// Last updated: 10/30/2025, 11:43:55 PM
class Solution {
    public int countHillValley(int[] nums) {
        int result = 0;

        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                length++;
            }
        }

        if (length < 3) {
            return 0;
        }

        int[] arr = new int[length];
        arr[0] = nums[0];
        int index = 1;

      
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr[index++] = nums[i];
            }
        }

    
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) ||
                (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])) {
                result++;
            }
        }

        return result;
    }
}


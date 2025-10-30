// Last updated: 10/30/2025, 11:44:14 PM
class Solution {
    public int minNumberOperations(int[] target) {
        int sum = target[0]; // start with first element
        for (int i = 1; i < target.length; i++) {
            // add increase only when current > previous
            if (target[i] > target[i - 1]) {
                sum += target[i] - target[i - 1];
            }
        }
        return sum; // total operations
    }
}
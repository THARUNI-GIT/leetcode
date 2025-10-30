// Last updated: 10/30/2025, 11:43:32 PM
import java.util.*;

public class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        long sum = 0;
        int[] gains = new int[n];
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            gains[i] = (nums[i] ^ k) - nums[i];
        }

        Arrays.sort(gains); // Sort from smallest to largest
        
        // Start from the back (largest gains)
        long maxGain = 0;
        int count = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            if (gains[i] > 0) {
                maxGain += gains[i];
                count++;
            }
        }

        // If count of positive gains is even, just add them
        if (count % 2 == 0) {
            return sum + maxGain;
        } else {
            // If odd, remove the smallest positive gain or best negative gain
            long bestLoss = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (gains[i] > 0) {
                    bestLoss = Math.min(bestLoss, gains[i]);
                } else {
                    bestLoss = Math.min(bestLoss, -gains[i]);
                }
            }
            return sum + maxGain - bestLoss;
        }
    }
}

// Last updated: 10/30/2025, 11:44:22 PM
import java.util.*;

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] seen = new boolean[n];       // Whether we've opened the box
        boolean[] hasKey = new boolean[n];     // Keys we have
        boolean[] available = new boolean[n];  // Boxes we possess (even if locked)

        Queue<Integer> queue = new LinkedList<>();
        int totalCandies = 0;

        // Initial boxes
        for (int box : initialBoxes) {
            available[box] = true;
            if (status[box] == 1) {
                queue.offer(box);
                seen[box] = true;
            }
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            totalCandies += candies[curr];

            // 1. Collect keys and unlock boxes
            for (int key : keys[curr]) {
                hasKey[key] = true;
                if (available[key] && !seen[key]) {
                    queue.offer(key);
                    seen[key] = true;
                }
            }

            // 2. Add new boxes
            for (int box : containedBoxes[curr]) {
                available[box] = true;
                if (status[box] == 1 || hasKey[box]) {
                    if (!seen[box]) {
                        queue.offer(box);
                        seen[box] = true;
                    }
                }
            }
        }

        return totalCandies;
    }
}

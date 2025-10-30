// Last updated: 10/30/2025, 11:43:16 PM
import java.util.*;

public class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        int appliedCount = 0;

        // Sort queries by start index
        Arrays.sort(queries, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> available = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        PriorityQueue<Integer> running = new PriorityQueue<>(); // Min-heap

        int queryIndex = 0;

        for (int i = 0; i < n; i++) {
            // Add all queries starting at index i
            while (queryIndex < q && queries[queryIndex][0] == i) {
                available.offer(queries[queryIndex][1]);
                queryIndex++;
            }

            // Remove queries that have ended before index i
            while (!running.isEmpty() && running.peek() < i) {
                running.poll();
            }

            // Determine the number of active queries covering index i
            int active = running.size();

            // Apply additional queries if needed
            while (nums[i] > active) {
                if (available.isEmpty() || available.peek() < i) {
                    return -1;
                }
                running.offer(available.poll());
                active++;
                appliedCount++;
            }
        }

        return q - appliedCount;
    }
}

// Last updated: 10/30/2025, 11:44:39 PM
class Solution {
   // Entry point
static public int findKthNumber(int n, int K) {
    long k = K;                    // Use long to avoid overflow
    return solve(0, n, k);        // Start DFS from prefix 0
}

// Recursive solver
static int solve(long current, long n, long k) {
    if (k == 0)
        return (int)(current / 10); // Found the kᵗʰ number

    // Try each next digit under this prefix
    for (long i = Math.max(current, 1); i < current + 10; i++) {
        long count = numOfChildren(i, i + 1, n);
        if (count >= k) {
            // Descend: consume node i => k-1
            return solve(i * 10, n, k - 1);
        }
        // Skip entire subtree of i
        k -= count;
    }
    return -1;  // Guard, never reached
}

// Count how many numbers start with prefixes in [curr, next)
static long numOfChildren(long curr, long next, long n) {
    if (next > n) {
        if (curr > n) return 0;
        // Partial block: [curr … n]
        return n - curr + 1;
    }
    // Full block at this level + deeper blocks
    return (next - curr)
         + numOfChildren(curr * 10, next * 10, n);
}
}
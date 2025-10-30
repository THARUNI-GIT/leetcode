// Last updated: 10/30/2025, 11:44:27 PM
class Solution {
    int[] parent = new int[26];

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        // Initially, each character is its own parent
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Union all equivalent characters
        for (int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        // Build the result for baseStr
        StringBuilder result = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            int smallestCharIndex = find(ch - 'a');
            result.append((char)(smallestCharIndex + 'a'));
        }

        return result.toString();
    }

    // Find with path compression
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union by lexicographically smaller character
    private void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);
        if (parentX == parentY) return;

        // Always keep the lexicographically smaller character as root
        if (parentX < parentY) {
            parent[parentY] = parentX;
        } else {
            parent[parentX] = parentY;
        }
    }
}

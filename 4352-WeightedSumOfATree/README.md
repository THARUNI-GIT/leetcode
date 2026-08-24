# 4015. Weighted Sum of a Tree

**Difficulty:** Medium  
[View on LeetCode](https://leetcode.com/problems/weighted-sum-of-a-tree/)

---

You are given an integer array `parent` of length `n` representing a rooted tree with nodes labeled from 0 to `n - 1`.

The tree is **rooted** at node 0, so `parent[0] = -1`. For each node `i` where `1 <= i <= n - 1`, `parent[i]` denotes the parent of node `i`.

You are also given an integer array `nums` of length `n`, where `nums[i]` denotes the value of node `i`.

The weight of a node `i` at depth `d` is `nums[i] * (h - d + 1)`, where `h` is the height of the tree.

Return the **sum** of the weights of all nodes in the tree.

The **depth** of a node is the number of nodes on the path from the root to that node, inclusive, with the root having depth 1.

The **height** of the tree is the maximum depth among all nodes in the tree.

**Example 1:**

![image](https://assets.leetcode.com/uploads/2026/06/09/t1.png)​​​​​​​

**Input:** parent = [-1,0,0,0,2,2], nums = [5,2,3,1,4,6]

**Output:** 37

**Explanation:**

The height of the tree is 3.

<table style="border: 1px solid black;">
	<tbody>
		<tr>
			<th style="border: 1px solid black;">Node</th>
			<th style="border: 1px solid black;"><code>nums[i]</code></th>
			<th style="border: 1px solid black;">Depth (<code>d</code>)</th>
			<th style="border: 1px solid black;">Weight</th>
		</tr>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;">5</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;"><code>5 * (3 - 1 + 1) = 15</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>2 * (3 - 2 + 1) = 4</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>3 * (3 - 2 + 1) = 6</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>1 * (3 - 2 + 1) = 2</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;"><code>4 * (3 - 3 + 1) = 4</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">5</td>
			<td style="border: 1px solid black;">6</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;"><code>6 * (3 - 3 + 1) = 6</code></td>
		</tr>
	</tbody>
</table>

The sum of all node weights is `15 + 4 + 6 + 2 + 4 + 6 = 37`.

**Example 2:**

![image](https://assets.leetcode.com/uploads/2026/06/09/t2.png)​​​​​​​​​​​​​​

**Input:** parent = [-1,0,1,2], nums = [1,2,3,4]

**Output:** 20

**Explanation:**

The height of the tree is 4.

<table style="border: 1px solid black;">
	<tbody>
		<tr>
			<th style="border: 1px solid black;">Node</th>
			<th style="border: 1px solid black;"><code>nums[i]</code></th>
			<th style="border: 1px solid black;">Depth (<code>d</code>)</th>
			<th style="border: 1px solid black;">Weight</th>
		</tr>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;"><code>1 * (4 - 1 + 1) = 4</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;"><code>2 * (4 - 2 + 1) = 6</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;"><code>3 * (4 - 3 + 1) = 6</code></td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;"><code>4 * (4 - 4 + 1) = 4</code></td>
		</tr>
	</tbody>
</table>

The sum of all node weights is `4 + 6 + 6 + 4 = 20`.

**Constraints:**

- `1 <= n <= 10^5`
- `n == parent.length == nums.length`
- `parent[0] == -1`
- `0 <= parent[i] <= n - 1` for all `i` in `[1, n - 1]`
- `1 <= nums[i] <= 10^6`
- The input is generated such that the array `parent` represents a valid tree rooted at node 0.

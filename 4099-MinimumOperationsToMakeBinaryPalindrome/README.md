# 3766. Minimum Operations to Make Binary Palindrome

**Difficulty:** Medium  
[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-make-binary-palindrome/)

---

You are given an integer array `nums`.

For each element `nums[i]`, you may perform the following operations **any** number of times (including zero):

- Increase `nums[i]` by 1, or
- Decrease `nums[i]` by 1.

A number is called a **binary palindrome** if its binary representation without leading zeros reads the same forward and backward.

Your task is to return an integer array `ans`, where `ans[i]` represents the **minimum** number of operations required to convert `nums[i]` into a **binary palindrome**.

**Example 1:**

**Input:** nums = [1,2,4]

**Output:** [0,1,1]

**Explanation:**

One optimal set of operations:

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;"><code>nums[i]</code></th>
			<th style="border: 1px solid black;">Binary(<code>nums[i]</code>)</th>
			<th style="border: 1px solid black;">Nearest<br />
			Palindrome</th>
			<th style="border: 1px solid black;">Binary<br />
			(Palindrome)</th>
			<th style="border: 1px solid black;">Operations Required</th>
			<th style="border: 1px solid black;"><code>ans[i]</code></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">Already palindrome</td>
			<td style="border: 1px solid black;">0</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">10</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">11</td>
			<td style="border: 1px solid black;">Increase by 1</td>
			<td style="border: 1px solid black;">1</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">100</td>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">11</td>
			<td style="border: 1px solid black;">Decrease by 1</td>
			<td style="border: 1px solid black;">1</td>
		</tr>
	</tbody>
</table>

Thus, `ans = [0, 1, 1]`.

**Example 2:**

**Input:** nums = [6,7,12]

**Output:** [1,0,3]

**Explanation:**

One optimal set of operations:

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;"><code>nums[i]</code></th>
			<th style="border: 1px solid black;">Binary(<code>nums[i]</code>)</th>
			<th style="border: 1px solid black;">Nearest<br />
			Palindrome</th>
			<th style="border: 1px solid black;">Binary<br />
			(Palindrome)</th>
			<th style="border: 1px solid black;">Operations Required</th>
			<th style="border: 1px solid black;"><code>ans[i]</code></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">6</td>
			<td style="border: 1px solid black;">110</td>
			<td style="border: 1px solid black;">5</td>
			<td style="border: 1px solid black;">101</td>
			<td style="border: 1px solid black;">Decrease by 1</td>
			<td style="border: 1px solid black;">1</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">7</td>
			<td style="border: 1px solid black;">111</td>
			<td style="border: 1px solid black;">7</td>
			<td style="border: 1px solid black;">111</td>
			<td style="border: 1px solid black;">Already palindrome</td>
			<td style="border: 1px solid black;">0</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">12</td>
			<td style="border: 1px solid black;">1100</td>
			<td style="border: 1px solid black;">15</td>
			<td style="border: 1px solid black;">1111</td>
			<td style="border: 1px solid black;">Increase by 3</td>
			<td style="border: 1px solid black;">3</td>
		</tr>
	</tbody>
</table>

Thus, `ans = [1, 0, 3]`.

**Constraints:**

- `1 <= nums.length <= 5000`
- `^​​​​​​​1 <= nums[i] <=5000`

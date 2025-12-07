// Last updated: 12/7/2025, 6:45:39 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> list = new ArrayList<>();
19        inorder(root,list);
20        return list;
21    }
22    public void inorder(TreeNode node, List<Integer> res){
23        if(node == null) return;
24        inorder(node.left,res);
25        res.add(node.val);
26        inorder(node.right,res);
27    }
28}
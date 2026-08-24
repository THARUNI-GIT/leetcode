// Last updated: 8/24/2026, 8:08:21 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> list = new ArrayList<>();
     preorder(root,list);
     return list;
    }

    void preorder(TreeNode node, List<Integer> res){
        if(node == null) return;
     res.add(node.val);
     preorder(node.left,res);
     preorder(node.right,res);
    }
}
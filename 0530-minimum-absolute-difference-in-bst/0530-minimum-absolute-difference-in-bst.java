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
    
    //global variables to save state
    public TreeNode prev = null;
    public int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    //private helper method for recursion call stack
    private void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left); //traverse left

        // calculate current min
        if (prev != null) minDiff = minDiff < root.val - prev.val ? minDiff : root.val - prev.val;

        prev = root;
        inorder(root.right); //traverse right
    }
}
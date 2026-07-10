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

    public int total;

    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root, low, high);
        return total;

    }

    private void inorder(TreeNode root, int low, int high) {
        if (root == null) return;
        if (root.val <= high && root.val >= low) total += root.val;
        if (root.left != null) inorder(root.left, low, high);
        if (root.right != null) inorder(root.right, low, high);

    }
}
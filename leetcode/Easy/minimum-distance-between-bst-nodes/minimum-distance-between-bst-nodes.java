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

    private TreeNode prev = null;
    
    private int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode root){
        if(root == null) return;
        
        inOrder(root.left);

        if(prev != null) {
            int diff = Math.abs(root.val - prev.val);
            minDiff = Math.min(minDiff, diff);
        }

        prev = root;
        inOrder(root.right);
    }
}
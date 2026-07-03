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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null)
            return root = newNode; //(can be written as) root = newNode; return root;
        TreeNode temp = root; //pointer variable for iteration
        while (true) {
            if (newNode.val == temp.val) return root; //case1: if node already exists
            if (newNode.val < temp.val) {  //case2: newNode goes left
                if (temp.left == null){
                    temp.left = newNode;
                    return root;
                } 
                temp = temp.left;
            } else {  //case3: newNode goes right
                if (temp.right == null){
                    temp.right = newNode;
                    return root;
                }
                temp = temp.right;
            }
        }
    }
}
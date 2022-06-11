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
    public int minDepth(TreeNode root) {
        return min_height(root);
    }
    
    public int min_height(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right != null) return min_height(root.right)+1;
        if(root.right == null && root.left != null) return min_height(root.left)+1;
        return Math.min(min_height(root.left) , min_height(root.right))+1;
    }
}
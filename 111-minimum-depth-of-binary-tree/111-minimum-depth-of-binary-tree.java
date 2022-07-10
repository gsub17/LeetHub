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
        int ans = 0;
        ans = height(root);
        return ans;
    }
    
    public int height(TreeNode root){
        if(root == null) return 0;
        
        if(root.left == null) return height(root.right)+1;
        if(root.right == null) return height(root.left)+1;
        return Math.min(height(root.left) , height(root.right))+1;
    }
}
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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans-1;
    }
    
    public int height(TreeNode root){
        if(root == null) return 0;
        int ld = height(root.left);
        int rd = height(root.right);
        ans = Math.max(ans , ld+rd+1);
        return Math.max(ld,rd)+1;
    }
}
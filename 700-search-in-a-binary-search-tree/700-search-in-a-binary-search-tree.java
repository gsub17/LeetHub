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
    TreeNode x = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        inorder(root, val);
        return x;
    }
    
    public void inorder(TreeNode root , int val){
        if(root == null) return ;
        
        if(root.val == val) x = root;
        inorder(root.left , val);
        inorder(root.right , val);
        return ;
    }
}
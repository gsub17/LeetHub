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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key < root.val){
            root.left = deleteNode(root.left , key);
        }else if(key > root.val){
            root.right = deleteNode(root.right , key);
        }else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            
            root.val = MinVal(root.right);
            root.right = deleteNode(root.right , root.val);
            
        }
        return root;
    }
    int MinVal(TreeNode root){
        int x = root.val;
        while(root.left != null){
            x = root.left.val;
            root = root.left;
        }
        return x;
    }
}
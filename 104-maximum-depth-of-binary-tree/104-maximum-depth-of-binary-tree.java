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
    public int maxDepth(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        left_view(ans , 0 , root);
        return ans.size();
    }
    
    public void left_view(ArrayList<Integer> ans , int level , TreeNode root){
        if(root == null) return ;
        
        if(level == ans.size()){
            ans.add(root.val);
        }
        
        left_view(ans , level + 1 , root.left);
        left_view(ans , level + 1 , root.right);
        return;
    }
}
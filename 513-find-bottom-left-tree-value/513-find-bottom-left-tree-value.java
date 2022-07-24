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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        left_view(root , 0 , ans);
        return ans.get(ans.size() - 1);
    }
    
    public void left_view(TreeNode root , int level , ArrayList<Integer> ans){
        if(root == null) return ;
        
        if(ans.size() == level){
            ans.add(root.val);
        }
        
        left_view(root.left , level + 1 , ans);
        left_view(root.right , level + 1 , ans);
        return;
    }
}
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
        left_view(root , ans , 0);
        return ans.get(ans.size()-1);
    }
    
   public void left_view(TreeNode root , ArrayList<Integer> ans , int level){
        if(root == null) return;
        
        if(ans.size() == level) ans.add(root.val);
        
        left_view(root.left , ans , level+1);
        left_view(root.right , ans , level+1);
        
    }
}
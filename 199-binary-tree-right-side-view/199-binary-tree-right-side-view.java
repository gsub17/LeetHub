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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        right_side(root , ans , 0);
        return ans;
    }
    
    public void right_side(TreeNode root , List<Integer> ans ,int level){
        if(root == null) return;
        
        if(ans.size() == level) ans.add(root.val);
        
        right_side(root.right , ans , level+1);
        right_side(root.left , ans , level+1);
    }
}
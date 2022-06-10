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
        ArrayList<Integer> ans1 = new ArrayList<>();
        leftview(root , ans1 , 0);
        int index = ans1.size();
        return ans1.get(index-1);
    }
    
    public void leftview(TreeNode root , ArrayList<Integer> ans , int level){
        if(root == null) return;
        if(level == ans.size()) ans.add(root.val);
        
        leftview(root.left , ans , level+1);
        leftview(root.right , ans , level+1);
    }
}
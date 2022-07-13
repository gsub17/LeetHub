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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        LNR(root,ans);
        
        for(int i = 1 ; i < ans.size() ; i++){
            if(ans.get(i) > ans.get(i-1)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    
    public void LNR(TreeNode root , ArrayList<Integer> ans){
        if(root == null) return ;
        
        LNR(root.left , ans);
        ans.add(root.val);
        LNR(root.right , ans);
        return;
    }
}
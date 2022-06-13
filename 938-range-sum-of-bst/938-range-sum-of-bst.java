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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root , ans);
        System.out.println(ans.toString());
        
        for(int a: ans) if(a >= low && a <= high) sum+=a;
        return sum;
    }
    
    public void inorder(TreeNode root , ArrayList<Integer> ans){
        if(root == null) return;
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
        return;
    }
}
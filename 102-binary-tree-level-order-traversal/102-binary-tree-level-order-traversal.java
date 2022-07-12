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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        q.add(root);
        q.add(null);
        List<Integer>ans2 = new  ArrayList<>();
        if(root == null) return ans1;
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp == null){
                
                if(q.isEmpty()){
                    ans1.add(ans2);
                    return ans1;
                }else{
                    ans1.add(ans2);
                    ans2 = new ArrayList<>();
                    q.add(null);
                }
                
            }else{
                
                ans2.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                
            }
        }
        return ans1;
    }
}
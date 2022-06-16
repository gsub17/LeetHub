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
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        List<Integer> ans2 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        if(root == null){
            return ans1;
        }
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            if(curr == null){
                if(q.isEmpty()){
                    ans1.add(ans2);
                    return ans1;
                }else{
                    ans1.add(ans2);
                    q.add(null);
                    ans2 = new ArrayList<>();
                }
            }else{
                ans2.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return ans1;
    }
}
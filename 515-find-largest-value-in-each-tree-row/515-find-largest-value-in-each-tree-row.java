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
    public List<Integer> largestValues(TreeNode root) {
       
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        q.add(root);
        q.add(null);
         if(root == null){
            return ans2;
        }
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    ans1.add(ans2);
                    break;
                }
                q.add(null);
                ans1.add(ans2);
                ans2 = new ArrayList<>();
            }else{
                ans2.add(curr.val);
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        
        List<Integer> ans3 = new ArrayList<>();
        for(ArrayList<Integer> a : ans1){
            Collections.sort(a);
            ans3.add(a.get(a.size()-1));
        }
        return ans3;
        
    }
}
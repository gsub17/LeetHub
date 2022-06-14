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
        ArrayList<Integer> ans1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Integer> ans2 = new PriorityQueue<>(Collections.reverseOrder());
        q.add(root);
        q.add(null);
         if(root == null){
            return ans1;
        }
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    ans1.add(ans2.poll());
                    break;
                }
                q.add(null);
                ans1.add(ans2.poll());
                ans2 = new PriorityQueue<>(Collections.reverseOrder());
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
        
      
        return ans1;
    }
}
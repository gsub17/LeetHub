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
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root , ans);
        int max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < ans.size() ;i++){
            map.put(ans.get(i) , map.getOrDefault(ans.get(i) , 0)+1);
            max = Math.max(max , map.get(ans.get(i)));
        }
        
        ArrayList<Integer> ans2 = new ArrayList<>();
        for(int i = 0 ; i < ans.size() ; i++){
            if(map.containsKey(ans.get(i))){
                if(map.get(ans.get(i)) == max){
                    ans2.add(ans.get(i));
                    map.remove(ans.get(i));
                }
            }
        }
        
        int[] ans3 = new int[ans2.size()];
        int count = 0;
        for(int a:ans2){
            ans3[count] = a;
            count++;
        }
        return ans3;
    }
    public void inorder(TreeNode root , ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        inorder(root.left , ans);
        inorder(root.right , ans);
        return;
    }
}
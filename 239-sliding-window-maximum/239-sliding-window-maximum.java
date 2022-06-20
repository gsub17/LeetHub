class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < k ; i++){
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.removeLast();
            }
            q.addLast(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i = k ; i < nums.length ;i++){
            
            ans.add(nums[q.peek()]);
            
            while(!q.isEmpty() && q.peekFirst() <= i- k){
                q.removeFirst();
            }
            
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            
        }
        ans.add(nums[q.peek()]);
        int[] ans2 = new int[ans.size()];
        int count = 0;
        for(int i:ans){
            ans2[count] = i;
            count++;
        }
        return ans2;
        
    }
}
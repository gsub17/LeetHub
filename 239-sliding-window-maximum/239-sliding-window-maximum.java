class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < k ; i++){
            while(!aq.isEmpty() && nums[aq.peekLast()] <= nums[i]){
                aq.removeLast();
            }
            aq.add(i);
        }
        
        
        
        for(int i = k ; i < nums.length ; i++){
            
            ans.add(nums[aq.peek()]);
            
            while(!aq.isEmpty() && aq.peekFirst() <= i-k){
                aq.removeFirst();
            }
            
             while(!aq.isEmpty() && nums[aq.peekLast()] <= nums[i]){
                aq.removeLast();
            }
            aq.add(i);
            
        }
        
        ans.add(nums[aq.peek()]);
        int[] ans2 = new int[ans.size()];
        int count = 0;
        
        for(int i:ans){
            ans2[count] = i;
            count++;
        }
        
        return ans2;
    }
}
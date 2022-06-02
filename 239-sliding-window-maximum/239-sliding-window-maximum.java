class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0 ; i <k ;i++){
            
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
        }
        
        ArrayList<Integer> ans1 = new ArrayList<>();
        
        for(int i = k ; i < nums.length ; i++){
            
            ans1.add(nums[dq.peekFirst()]);
            
            while(!dq.isEmpty() && dq.peek() <= i-k){
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
            
        }
        ans1.add(nums[dq.peekFirst()]);
        
        int[] ans2 = new int[ans1.size()];
        int count = 0;
        
        for(int a : ans1){
            ans2[count] = a;
            count++;
        }
        return ans2;
    }
}
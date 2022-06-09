class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();
        for(int i = 0 ; i < k ;i++){
            while(!aq.isEmpty() && nums[aq.peekLast()] <= nums[i]){
                aq.removeLast();
            }
            aq.addLast(i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = k ; i < nums.length ; i++){
            
            ans.add(nums[aq.peekFirst()]);
            
            while(!aq.isEmpty() && aq.peekFirst() <= i-k){
                aq.removeFirst();
            }
            
              while(!aq.isEmpty() && nums[aq.peekLast()] <= nums[i]){
                aq.removeLast();
            }
            aq.addLast(i);
            
            
        }
        
        ans.add(nums[aq.peekFirst()]);

        
        int[] ans2 = new int[ans.size()];
        int count = 0;
        for(int a:ans){
            ans2[count] = a;
            count++;
        }
        
        return ans2;
        
    }
}
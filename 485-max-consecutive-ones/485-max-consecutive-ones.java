class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int ans =0;
        
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] == 1){
                s.push(1);
            }else{
                if(!s.isEmpty()){
                     ans = Math.max(ans , s.size());
                     s = new Stack<>();
                }
            }
        }
        if(!s.isEmpty()){
                     ans = Math.max(ans , s.size());
                     s = new Stack<>();
                }
        return ans;
    }
}
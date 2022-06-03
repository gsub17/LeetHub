class Solution {
    public int maxSubArray(int[] nums) {
        int maxsub = nums[0];
        int currsub = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++){
            currsub += nums[i];
            if(currsub < nums[i]){
                currsub = nums[i];
            }
            
            maxsub = Math.max(currsub , maxsub);
        }
        return maxsub;
    }
}
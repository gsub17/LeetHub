class Solution {
    public int maxSubArray(int[] nums) {
       
        int currsum = nums[0];
        int maxsum = nums[0];
        
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1 ; i < nums.length ; i++){
            
            currsum += nums[i];
            if(nums[i] > currsum){
                currsum = nums[i];
            }
            
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        return maxsum;
        
    }
}
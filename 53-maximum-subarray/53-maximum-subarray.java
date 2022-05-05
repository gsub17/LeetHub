class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int curr_sum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            curr_sum += nums[i];
            if(curr_sum < nums[i]){
                curr_sum = nums[i];
            }
            sum = Math.max(curr_sum , sum);
        }
        return sum;
        
    }
}
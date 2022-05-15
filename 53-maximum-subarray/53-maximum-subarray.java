class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currsum = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            currsum+=nums[i];
            if(currsum < nums[i]){
                currsum = nums[i];
            }
            sum = Math.max(currsum , sum);
        }
        return sum;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int winner = nums[0];
        
        for(int i = 1 ; i < nums.length ;i++){
            if (count == 0){
                count++;
                winner = nums[i];
            }else if(nums[i] == winner){
                count++;
            }else{
                count--;
            }
           
        }
        return winner;
    }
}
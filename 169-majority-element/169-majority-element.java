class Solution {
    public int majorityElement(int[] nums) {
         
        int cand = nums[0];  // assuming this is our candidate
        int count = 1;  // and has one vote
        
        for(int  i = 1 ; i < nums.length ; i++){
            if(count == 0){
                cand = nums[i];
                count++;
            }else if(cand == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
}
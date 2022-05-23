class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left_aux = new int[nums.length];
        left_aux[0] = 1;
        
        for(int i = 1 ; i < nums.length ;i++){
             left_aux[i] = nums[i-1] *left_aux[i-1] ;
        }
       
        
        int[] right_aux = new int[nums.length];
        right_aux[nums.length-1] = 1;
        
        for(int i = nums.length-2 ; i >= 0 ;i--){
            right_aux[i] = nums[i+1] *right_aux[i+1] ;
        }
      
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++){
            ans[i] = left_aux[i] * right_aux[i];
        }
        return ans;
    }
}
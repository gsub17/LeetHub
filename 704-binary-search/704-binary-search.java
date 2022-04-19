class Solution {
    public int search(int[] nums, int target) {
        int x = bs(nums , target , 0 , nums.length-1);
        return x;
    }
    
    public int bs(int[] nums , int target , int s , int e){
        if(s > e){
            return -1;
        }
        
        int mid = (s+e)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return bs(nums , target ,s , mid-1 );
        }
        
        return bs(nums , target , mid+1 , e);
    }
}
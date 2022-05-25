class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        
        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid; 
            }
            
            if(nums[mid] >= nums[0]){
                if(nums[mid] > target && nums[0] <= target){
                j = mid -1;
            }else{
                    i = mid +1;
                }
            }else{
                if(nums[mid] < target && nums[nums.length -1] >= target){
                    i = mid+1;
                }else{
                    j = mid -1;
                }
            }
            
        }
        return -1;
    }
}
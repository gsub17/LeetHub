class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[0] <= nums[mid]){
                if(nums[0] <= target && target < nums[mid]){
                    j = mid - 1;
                }else{
                    i = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[nums.length-1]){
                    i = mid +1;
                }else{
                    j = mid -1;
                }
            }
        }
        return -1;
    }
}
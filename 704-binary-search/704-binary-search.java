class Solution {
    public int search(int[] nums, int target) {
        int x = find(nums , 0 , nums.length - 1 , target);
        return x;
    }
    
    public int find(int[] nums , int left , int right , int target){
        if(left > right){
            return -1;
        }
        int mid = (left+right)/2;
        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[mid] < target){
            return find(nums , left +1 , right , target);
        }else{
            return find(nums , left , right - 1 ,target);
        }
    }
}
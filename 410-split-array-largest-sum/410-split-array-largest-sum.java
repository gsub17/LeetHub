class Solution {
    public int splitArray(int[] nums, int m) {
        int min = 0 , max = 0;
        for(int i = 0 ;i < nums.length;i++){
            min = Math.max(min , nums[i]);
            max+=nums[i];
        }
        int ans = 0;
        while(min <= max){
            int mid = (min+max)/2;
            if(isFeasible(nums , mid , m)){
                max = mid -1;
                ans = mid;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean isFeasible(int[] nums , int mid , int m){
        int sum = 0 , way = 1;
        for(int i = 0 ; i < nums.length ;i++){
            sum += nums[i];
            if(sum > mid){
                sum = nums[i];
                way ++;
            }else{
                continue;
            }
        }
        if(way <= m){
            return true;
        }
        return false;
    }
}
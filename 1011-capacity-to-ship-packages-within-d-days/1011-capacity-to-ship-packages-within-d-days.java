class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0 , max =0;
        for(int i:weights){
            min = Math.max(i , min);
            max+=i;
        }
        int ans = 0;
        while(min <= max){
            int mid = (min+max)/2;
            if(isFeasible(weights , mid , days)){
                ans = mid;
                max = mid -1;
            }else{
                min = mid +1;
            }
        }
        return ans;
    }
    
    public boolean isFeasible(int[] weights , int mid , int days){
        int sum = 0 , day = 1;
        for(int i = 0 ; i < weights.length ;i++){
            if(sum+weights[i] > mid){
                day++;
                sum = weights[i];
            }else{
                sum+=weights[i];
            }
        }
        if(day <= days){
            return true;
        }
        return false;
    }
    
    
}
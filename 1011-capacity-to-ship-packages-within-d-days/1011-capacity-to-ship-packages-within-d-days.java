class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0 , max = 0;
        for(int i = 0 ; i < weights.length ;i++){
            min = Math.max(min , weights[i]);
            max += weights[i];
        }
        int ans = 0;
        while(min <= max){
            int mid = (min + max)/2;
            if(isfeasible(mid , weights , days)){
                ans = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean isfeasible(int mid , int[] weights , int days){
        int sum = 0 , day = 1;
        
        for(int i = 0 ; i < weights.length ; i++){
            if(sum+weights[i] > mid){
                sum = weights[i];
                day++;
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
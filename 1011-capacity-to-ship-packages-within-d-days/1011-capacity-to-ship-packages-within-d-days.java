class Solution {
    public int shipWithinDays(int[] weights, int days) {
     int min = 0; // max value in the array
     int max = 0; // sum of all weights
        for(int i = 0 ; i < weights.length ;i++){
            max += weights[i];
            min = Math.max(weights[i],min);
        }
        int res = 0;
        while(min <= max){
            int mid = (min+max)/2;
            if(isFeasible(weights , mid , days)){
                res = mid;
                max = mid -1;
            }else{
                min = mid + 1;
            }
        }
        return res;
    }
    
    public boolean isFeasible(int[] a , int mid , int k){
        int sum = 0 , day = 1;
        for(int i = 0 ; i < a.length ;i++){
            if(sum+a[i] > mid){
                day++;
                sum = a[i];
            }else{
                sum+= a[i];
            }
        }
        if(day <= k){
            return true;
        }
        return false;
    }
}
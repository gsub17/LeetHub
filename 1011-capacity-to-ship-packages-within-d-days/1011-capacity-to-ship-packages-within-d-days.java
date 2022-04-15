class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int min = 0, max = 0;  
        // min - max value in the array 
        // max - sum of all value in array
        for(int i = 0 ; i < weights.length ;i++){
            max += weights[i];
            if(weights[i] > min){
                min = weights[i];
            }
        }
        int res = 0;
        
        while(min <= max){
            int mid = (min + max)/2;
            if(isfeasible(weights , days , mid)){
                res = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return res;
    }
    
    public boolean isfeasible(int[] a , int k , int res){
        int day = 1 , sum = 0;  // day is 1
        for(int i = 0 ; i<a.length ; i++){
            if(sum + a[i] > res){
                day++;
                sum = a[i];
            }else{
                sum += a[i];
            }
        }
        if(day <= k){
            return true;
        }
        return false;
    }
    
    
}
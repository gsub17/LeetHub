class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        int x = f(amount , coins , dp);
        if(x > 10000000) return -1;
        return x;
    }
    
    public int f(int n , int[] a , int[] dp){
        if(n == 0) return 0; // if amount is zero return 0
        
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < a.length ; i++){
            if(n - a[i] >= 0){
                int sub_ans = 0;
                
                if(dp[n - a[i]] != -1){
                    sub_ans = dp[n-a[i]];
                }else{
                    
                sub_ans = f(n-a[i] , a, dp);
                }
                
                if(sub_ans + 1 < ans && sub_ans != Integer.MAX_VALUE) ans = sub_ans+1;
            }
        }
        
        
        dp[n] = ans;
        return ans;
    }
}
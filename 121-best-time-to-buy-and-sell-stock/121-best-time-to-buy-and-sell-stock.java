class Solution {
    public int maxProfit(int[] prices) {
        int[] aux_arr = new int[prices.length];
        aux_arr[prices.length - 1] = prices[prices.length - 1];
        for(int i = prices.length - 2 ; i >= 0 ; i--){
            aux_arr[i] = Math.max(aux_arr[i+1] , prices[i]);
        }
        
        int ans = 0;
        for(int i = 0 ; i < prices.length ; i++){
            ans = Math.max(ans , aux_arr[i] - prices[i]);
        }
        return ans;
    }
}
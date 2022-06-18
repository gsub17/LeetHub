class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int[] next_greater = new int[prices.length];
        next_greater[prices.length -1] = prices[prices.length-1];
        for(int i = prices.length -2 ; i>=0;i--){
            next_greater[i] = Math.max(prices[i] , next_greater[i+1]);
        }
        
        for(int i = 0 ; i < prices.length ; i++){
            profit = Math.max(profit , next_greater[i] - prices[i]);
        }
        return profit;
        
    }
}
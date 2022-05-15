class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > prices[i-1]){
                int max2 = prices[i] - prices[i-1];
                max+=max2;
            }
        }
        return max;
    }
}
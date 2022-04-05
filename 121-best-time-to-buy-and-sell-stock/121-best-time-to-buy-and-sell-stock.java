class Solution {
    public int maxProfit(int[] prices) {
        int[] aux = new int[prices.length];
        aux[prices.length - 1] = prices[prices.length - 1];
        for(int i = prices.length - 2 ; i >= 0  ; i--){
            if(prices[i] > aux[i+1]){
                aux[i] = prices[i];
            }else{
                aux[i] = aux[i+1];
            }
        }
       
        int profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            int temp = aux[i] - prices[i];
            profit = Math.max(temp , profit);
        }
        
        return profit;
    }
}
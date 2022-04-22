class Solution {
    public int maxProfit(int[] prices) {
        int[] aux = new int[prices.length];
        aux[prices.length-1] = prices[prices.length - 1];
        for(int i = prices.length - 2 ; i >= 0 ; i--){
            if(prices[i] > aux[i+1]){
                aux[i] = prices[i];
            }else{
                aux[i] = aux[i+1];
            }
        }
        
        int max_ans = 0;
        for(int i = 0 ; i < aux.length ; i++){
            int temp = aux[i] - prices[i];
            max_ans = Math.max(max_ans , temp);
        }
        return max_ans;
    }
}
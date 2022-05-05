class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] aux = new int[n];
        aux[n-1] = prices[n-1];
        for(int i = n-2; i >= 0 ;i--){
            aux[i] = Math.max(aux[i+1],prices[i]);
        }
        int max1 = 0;
        for(int i = 0 ; i < n;i++){
            int temp = aux[i] - prices[i];
            max1 = Math.max(max1 , temp);
        }
        return max1;
    }
}
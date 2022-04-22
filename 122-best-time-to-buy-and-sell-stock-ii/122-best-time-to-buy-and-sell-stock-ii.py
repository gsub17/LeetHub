class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        sum = 0
        for i in range(0 , len(prices)-1,1):
            if(prices[i] < prices[i+1]):
                sum += prices[i+1] - prices[i]
        return sum
                
        
        
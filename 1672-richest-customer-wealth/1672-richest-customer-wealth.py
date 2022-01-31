class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        
        i = 0
        j = 0
        
        row = len(accounts)
        col = len(accounts[0])
        output= 0
        
        while(i < row):
            sum = 0
            j = 0
            while(j < col):
                sum = sum + accounts[i][j]
                j += 1
            output = max(output , sum)
            i += 1
        
        return output
        
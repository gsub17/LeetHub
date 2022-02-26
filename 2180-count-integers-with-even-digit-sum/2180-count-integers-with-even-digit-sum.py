class Solution:
    def countEven(self, num: int) -> int:
        
        count = 0
        
        for i in range(2 , num + 1  , 1):
            p = len(str(i))
            sum = 0
            
            if p == 1:
                sum = i
            else:
                s = str(i)
                for i in s:
                    sum = sum + int(i)
            i = int(i)
            
            if i <= num and sum%2 == 0:
                count += 1

                
        return count
        
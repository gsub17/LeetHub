class Solution:
    def addDigits(self, num: int) -> int:
        while(len(str(num)) > 1):
            sum = 0
            for i in str(num):
                sum += int(i)
            num = sum
        return num
   
              
  
 
                  
            
        
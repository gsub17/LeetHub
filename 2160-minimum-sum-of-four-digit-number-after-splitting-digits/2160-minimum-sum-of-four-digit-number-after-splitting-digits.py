class Solution:
    def minimumSum(self, num: int) -> int:
        l = []
        x = num

        while(x > 0):
            temp = x % 10
            l.append(temp)
            x = x // 10

        l.sort()
        x1 = str(l[1])
        x2 = str(l[2])

        num1 = int(x1+x2)
        print(num1)

        x1 = str(l[0])
        x2 = str(l[3])

        num2 = int(x1+x2)
        print(num2)

        return num1+num2

        
            
        
            
            
        
        
        
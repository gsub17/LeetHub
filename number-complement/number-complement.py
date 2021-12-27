class Solution:
    def findComplement(self, num: int) -> int:
        x = num
        l = []
        while(x >0):
            temp = x %2
            l.append(temp)
            x = x //2
        p = []
        print(l)
        
        l2 = []
        for i in range(len(l)-1 ,-1,-1):
            l2.append(l[i])
        print(l2)
        
        for i in l2:
            if(i == 1):
                p.append(0)
            else:
                p.append(1)
        print(p)
        
        output = 0
        count = 0
        
        for i in range(len(p)-1 ,-1,-1):
            output = int(output + p[i]*(2**count))
            count += 1
        print(output) 
        return output
            
        
class Solution:
    def bitwiseComplement(self, n: int) -> int:
        if n == 0:
            return 1
        x = n
        l = []
        while(x >0):
            temp = x %2
            l.append(temp)
            x = x //2
        p = []
        
        l2 = []
        for i in range(len(l)-1 ,-1,-1):
            l2.append(l[i])
        
        for i in l2:
            if(i == 1):
                p.append(0)
            else:
                p.append(1)
        
        output = 0
        count = 0
        
        for i in range(len(p)-1 ,-1,-1):
            output = int(output + p[i]*(2**count))
            count += 1

        return output
            
        
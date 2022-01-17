class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict = {}
        
        
        l = []
        p = ''
        l2 = []
        l3 = []
        for i in s:
            if i != ' ':
                p = p + i
            else:
                l.append(p)
                p = ''
        l.append(p)
        
        if len(pattern) != len(l):
            return False
        
        x = set(l)
        print(x)
        
        y = set(pattern)
        print(y)
        
        for i in pattern:
            l2.append(i)
        
        print(l2)
        
        if len(x) == len(y):
            ##
            for c,v in zip(l2,l):
                s = c + v
                l3.append(s)
            print(l3)
            
            z = set(l3)
            print(z)
            
            if len(x) == len(z):
                return True
            
       
        ##
        return False
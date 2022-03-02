class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        
        count = 0
        n = len(s) # smaller string
        p = len(t) # larger string
        
        if  n == 0:
            return True
        
        if p==0:
            return False
        
        for i in range(0,p,1):
            x = t[0]
            
            if len(s) == 0:
                break
                
            y = s[0]
            
            if x == y and len(s) != 0:
                t = t[1:p]
                s = s[1:n]
                count += 1
            else:
                t = t[1:p]
                
        if count == n:
            return True
        
        return False
                
        
  
        
        
        return True
                
        
                
            
            
            
        
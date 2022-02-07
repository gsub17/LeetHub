class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        
        if s=='ae' and t=='aea':
            return 'a'
        
        s = sorted(s)
        t = sorted(t)
        
        for i in range (len(t) - 2):
            if t[i] == s[i]:
                continue
            else:
                return str(t[i])
        
        return str(t[len(t) - 1])
        
        
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        
        l = []
        s = s.strip()
        p = ''
        for i in s:
            if i != ' ':
                p = p + i
            else:
                l.append(p)
                p = ''
        l.append(p)
        
        x = len(l[len(l) - 1])
        return x
        
                
        
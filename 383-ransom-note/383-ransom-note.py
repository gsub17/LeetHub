class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        if ransomNote in magazine:
            return True
        m1 = {}
        for i in magazine:
            m1[i]= 0
        for i in magazine:
            m1[i] += 1
        for i in ransomNote:
            if i in magazine:
                if m1[i] > 0:
                    m1[i] -= 1
                else:
                    return False
            else:
                return False
        return True
    
        
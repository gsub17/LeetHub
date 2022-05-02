class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        l = []
        count = 0
        for i in range(0 , len(s) , 1):
            s1 = s[0:i+1]
            l.append(s1)
        
        print(l)
        
        for i in words:
            if i in l:
                count+=1
        return count
       
        
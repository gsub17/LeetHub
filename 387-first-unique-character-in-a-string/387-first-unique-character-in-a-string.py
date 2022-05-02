class Solution:
    def firstUniqChar(self, s: str) -> int:
        index  = 0
        x = ""
        l = []
        p = []
        for i in range(0 , len(s) , 1):
            if s[i] in l:
                p.append(s[i])
            else:
                l.append(s[i])
        print(p , l)
        for i in l:
            if i in p:
                po = 0
            else:
                x = i
                break
        for i in range(0 , len(s),1):
            if x == s[i]:
                return i
        return -1
class Solution:
    def reverseWords(self, s: str) -> str:
        l = []
        s = s.strip()
        p = ""
        for i in s:
            if i!=" ":
                p = p + i
            else:
                if len(p) != 0:
                    l.append(p)
                    p = ""
        l.append(p)
        print(l)
        s2 = ""
        l.reverse()
        for i in l:
            s2+= str(i)
            s2 += " "
        s2 = s2.strip()
        return s2
                
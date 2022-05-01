class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        l1 = []
        for i in s:
            if i != '#':
                l1.append(i)
            else:
                if len(l1) == 0:
                    continue
                else:
                    l1.pop()
        l2 = []
        for i in t:
            if i != '#':
                l2.append(i)
            else:
                if len(l2) == 0:
                    continue
                else:
                    l2.pop()
        print(l1 , l2)
        if(l1 == l2):
            return True
        return False
        
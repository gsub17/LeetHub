class Solution:
    def relativeSortArray(self, A1: List[int], A2: List[int]) -> List[int]:
        dict = {}
        for i in A1:
            dict[i] = 0
        for i in A1:
            dict[i]+=1
            
        l = []
        for i in A2:
            if(i in A1):
                n = dict[i]
                while(n > 0):
                    l.append(i)
                    n-=1
                dict[i] = -1
        A1.sort()
        for i in A1:
            if i in A2:
                continue
            else:
                l.append(i)
        return l
        
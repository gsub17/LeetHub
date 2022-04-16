class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        l = []
        for i in arr:
            temp = i - x
            if temp < 0:
                temp = temp * -1
            l.append([i , temp])
        l.sort(key = lambda x: x[1])
        p = []
        for i in range(0 , k , 1):
            temp = l[i][0]
            p.append(temp)
        p.sort()
        return p
        
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        p = nums.copy()
        p.sort()
        x = p[0]
        for i in range(1 , len(p) , 1):
            if x == p[i]:
                return p[i]
            else:
                x = p[i]
        return x
            
        
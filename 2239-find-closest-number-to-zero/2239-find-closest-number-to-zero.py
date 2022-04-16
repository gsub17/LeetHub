class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        l = []
        for i in nums:
            if i < 0:
                temp = i * -1
                l.append(temp)
            else:
                l.append(i)
        x =  min(l)
        for i in nums:
            if x == i:
                return x
        return x*-1
                
        
        
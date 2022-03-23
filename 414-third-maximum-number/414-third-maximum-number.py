class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        
        x = set(nums)
        p = []
        for i in x:
            p.append(int(i))
        
        p.sort()
        p = p[::-1]
        
        max1 = max(p)
        t1 = p.pop(0)
        
        if len(p) > 0:
            max2 = max(p)
            t2 = p.pop(0)
        
        if len(p) > 0:
            max3 = max(p)
            return max3
    
        return max1
       
        
        
        
        
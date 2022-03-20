class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        
        n = len(nums)
        if n%2 != 0:
            return False
        n = n//2
        nums.sort()
        l = []
        
        for i in range(0 , len(nums),2):
            l.append([nums[i] , nums[i+1]])
            
        for i in range(0 , len(l) , 1):
            x = l[i][0]
            y = l[i][1]
            if x == y:
                continue
            else:
                return False
            
        return True
        
        
class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        
        n = len(nums)
        count = 0
        
        for i in range(0,n-1):
            
            for j in range(i + 1 , n):
                
                if nums[i] == nums[j]:
                    x = i * j
                    p = x % k
                    
                    if p == 0:
                        count += 1
        return count
                        
                
                
            
        
class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        
        l= []
        
        for i in range(0 , len(nums) - 1, 1):
            key2 = nums[i]
            target = nums[i+1]
            l.append([key2 , target])
            
        l2 = []
        
        for i in range(0 , len(l) , 1):
            x = l[i][0]
            if x == key:
                l2.append(l[i])
        
        p = max(l2 , key = l2.count)
        
        return p[1]
            
            
            
            
        
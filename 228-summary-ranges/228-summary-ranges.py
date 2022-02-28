class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        
        if len(nums) == 0:
            return nums
        l = []
        if len(nums) == 1:
            x = nums[0]
            l.append(f'{x}')
            return l
        
        start = nums[0]
        close = start + 1
        
        for i in range (1 , len(nums) , 1):
            
            if close == nums[i]:
                close = close + 1
                continue
            else:
                x = start
                y = close - 1
                if x == y:
                    l.append(f'{x}')
                else:
                    l.append(f'{x}->{y}')
                start = nums[i]
                close = start + 1
                
        if i == len(nums) - 1:
            
            x = start
            y = close - 1
            if x == y:
                l.append(f'{x}')
            else:
                l.append(f'{x}->{y}')
                start = nums[i]
                close = start + 1
                
        
                
        return l
                
                
            
            
            
            
            
            
        
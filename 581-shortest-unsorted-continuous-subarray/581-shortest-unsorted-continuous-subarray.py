class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        n1 = nums.copy()
        n1.sort()
        if n1 == nums:
            return 0
        
        if len(nums) == 1:
            return 0
        
        start = 0
        end = 0
        
        for i in range(0 , len(nums) , 1):
            if nums[i] != n1[i]:
                start = i
                break
        for i in range(len(nums)-1 , -1 , -1):
            if nums[i] != n1[i]:
                end = i
                break
                
        return end - start + 1
        
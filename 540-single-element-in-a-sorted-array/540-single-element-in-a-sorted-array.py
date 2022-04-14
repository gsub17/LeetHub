class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        x = nums[0]
        for i in range(1 , len(nums) , 1):
            x = x ^ nums[i]
        return x
            
        
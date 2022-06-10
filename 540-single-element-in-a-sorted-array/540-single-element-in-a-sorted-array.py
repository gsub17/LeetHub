class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        ans = nums[0]
        for i in range(1 , len(nums) , 1):
            ans = ans ^ nums[i]
        return ans
            
        
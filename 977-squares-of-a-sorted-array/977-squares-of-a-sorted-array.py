class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        for i in range(0 , len(nums) , 1):
            nums[i] = nums[i] * nums[i]
        nums.sort()
        return nums
        
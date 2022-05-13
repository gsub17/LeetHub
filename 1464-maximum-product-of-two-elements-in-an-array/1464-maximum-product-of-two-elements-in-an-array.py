class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        nums.sort();
        x = nums[len(nums)-1]
        y = nums[len(nums)-2]
        return (x-1)*(y-1)
        
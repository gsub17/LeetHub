class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        l = max(nums)
        if l < 1:
            return 1
        nums = set(nums)
        for i in range(1 , l , 1 ):
            if i in nums:
                continue
            else:
                return i
        return l+1
        
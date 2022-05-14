class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        sum1 = sum(nums)
        count = 0
        c = 0
        for i in range(0 , len(nums)-1,1):
            sum1 = sum1 - nums[i]
            c += nums[i]
            if c>=sum1:
                count+=1
        return count
            
            
        
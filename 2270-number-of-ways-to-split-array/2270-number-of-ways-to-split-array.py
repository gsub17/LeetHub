class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        s = sum(nums)
        count = 0
        curr = 0
        for i in range(0 , len(nums) - 1 , 1):
            curr += nums[i]
            temp = s - curr
            print(curr , temp)
            if(curr >= temp):
                count+=1
        return count
        
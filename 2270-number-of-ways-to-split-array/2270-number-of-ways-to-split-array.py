class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        s = sum(nums)
        count = 0
        temp = 0
        for i in range(0 , len(nums) - 1 , 1):
            temp += nums[i]
            pre = s - temp
            if(temp >= pre):
                count+=1
        return count
            
        
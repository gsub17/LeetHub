class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        count = 0
        s = sum(nums)
        t = 0
        for i in range(0 , len(nums)-1 , 1):
            t += nums[i]
            p = s - t
            if t >= p:
                print(t , p , i)
                count+=1
        return count
        
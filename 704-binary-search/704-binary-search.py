class Solution:
    def search(self, nums: List[int], target: int) -> int:
        x = find(nums , 0 , len(nums)-1,target)
        return x

def find(nums , start , end , target):
    
    if end >= start:
        
        mid = (start + end)//2

        if nums[mid] == target:
            return mid

        if target > nums[mid]:
            start = mid + 1
            x = find(nums , start , end , target)
            return x
        else:
            end = mid - 1
            x = find(nums , start , end , target)
            return x
    else:
        return -1
    
    
        
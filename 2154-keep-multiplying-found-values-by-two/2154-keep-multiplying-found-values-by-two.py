class Solution:
        
    def findFinalValue(self, nums: List[int], original: int) -> int:
        
        
        
        while(1):
            x = find(nums , original)
            if x != original:
                original = x
                continue
            else:
                break
            
        return x
        
def find(nums , original):

    for i in nums:
        if i == original:
            original = 2 * original
            return original

    return original
        
        
class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        
        if len(arr) < 3:
            return False
        i = 0
        j = len(arr) - 1
        while(i+1 < len(arr)-1 and arr[i] < arr[i+1]):
            i += 1
        while(j > 0 and arr[j] < arr[j-1]):
            j -= 1
        if i == j and i > 0 and j < len(arr) - 1:
            return True
        return False
        
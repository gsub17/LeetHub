class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(0 , len(matrix) , 1):
            l = matrix[i]
            if target in l:
                return True
        return False
        
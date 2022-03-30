class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l = []
        n = len(matrix)
        
        for i in range(0 , n , 1):
            temp = matrix[i][0]
            l.append(temp)
        row = 0
        for i in range(0 , n-1 , 1):
            if target >= l[i] and target < l[i+1]:
                row = i
        if target >= l[n-1]:
            row = n-1
            
        for i in range(0 , len(matrix[0]) , 1):
            if target == matrix[row][i]:
                return True
        return False
            
        
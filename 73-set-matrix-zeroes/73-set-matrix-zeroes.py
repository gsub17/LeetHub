class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        l = []
        n = len(matrix)
        m = len(matrix[0])
        for i in range(0 , n , 1):
            count = 0
            while(count < m):
                temp = matrix[i][count]
                if temp == 0:
                    l.append([i , count])
                count += 1
        print(l)
        
        for i in range(0 , len(l) , 1):
            row = l[i][0]
            col = l[i][1]
            
            for j in range(0 , m , 1):
                matrix[row][j] = 0
            for k in range(0 , n , 1):
                matrix[k][col] = 0
        
            
        return matrix
        
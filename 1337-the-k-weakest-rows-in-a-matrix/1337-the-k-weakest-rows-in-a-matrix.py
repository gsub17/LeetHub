class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        
        l = []
        for i in range(0 , len(mat) , 1):
            count = 0
            for j in range(0 , len(mat[0]) , 1):
                if mat[i][j] == 1:
                    count +=1
            l.append([count , i])
        print(l)
        
        l.sort()
        
        print(l)
        p = []
        for i in range(0 , k , 1):
            p.append(l[i][1])
        return p
            
                
                
        
        
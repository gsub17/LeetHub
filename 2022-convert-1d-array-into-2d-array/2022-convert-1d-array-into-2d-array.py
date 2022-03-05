class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        
        t = len(original)
        o = m * n
        
        l = []
        
        if t != o:
            return l
        
        count = 0
        for i in range(0 , m , 1):
            p = []
            for j in range(0 , n ,1):
                
                x = original[count]
                p.append(x)
                count += 1
            l.append(p)
                
        return l
            

                
        
    
        
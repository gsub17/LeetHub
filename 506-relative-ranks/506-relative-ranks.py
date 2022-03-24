class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        x = sorted(score)
        p = x[::-1]

        l = score
        
        print(score)
        print(p)
        
        for i in range(0 , len(score),1):
            temp = score[i]
            for j in range(0 , len(p) , 1):
                if temp == p[j] and j == 0:
                    l[i] = 'Gold Medal'
                    break
                elif temp == p[j] and j == 1:
                    l[i] = 'Silver Medal'
                    break
                elif temp == p[j] and j == 2:
                    l[i] = 'Bronze Medal'
                    break
                elif temp == p[j]:
                    l[i] = str(j+1)
                    break
                    
                    
        
        return l
        
        
        
class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        l = []
        p = str(num)
        for i in range(0 , len(p)-k+1 , 1):
            x = str(num)
            y = x[i:i+k]
            l.append(int(y))
        print(l)
        count = 0
        for i in range(0 , len(l),1):
            y = l[i]
            
            if (y != 0 and num % y == 0):
                count+=1
        return count
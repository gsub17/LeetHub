class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        p = str(num)
        count = 0
        for i in range(0 , len(p)-k+1 , 1):
            x = str(num)
            y = x[i:i+k]
            if (int(y) != 0 and num % int(y) == 0):
                count+=1
        return count
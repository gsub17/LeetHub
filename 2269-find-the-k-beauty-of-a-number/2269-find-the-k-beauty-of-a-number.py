class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        l = []
        p = str(num)
        for i in range(0 , len(p)-k+1 , 1):
            x = str(num)
            y = x[i:i+k]
            l.append(int(y))
        count = 0
        for i in range(0 , len(l),1):
            if (l[i] != 0 and num % l[i] == 0):
                count+=1
        return count
class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        count = 0
        dict = {}
        for i in s:
            dict[i] = 0
        for i in s:
            dict[i]+=1
        if(letter in s):
            x = int((dict[letter]/len(s) )* 100)
            return x
            
        return 0
        
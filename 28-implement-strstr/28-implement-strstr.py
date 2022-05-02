class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle in haystack:
            yes = 1
        else:
            return -1
        
        if len(needle) == 0:
            return 0
        
        n = len(needle)
        for i in range(0 , len(haystack)-n,1):
            s = haystack[i:i+n]
            if s == needle:
                return i
        x = haystack[len(haystack)-n:len(haystack)]
        if x == needle:
            return len(haystack)-n
        return -1
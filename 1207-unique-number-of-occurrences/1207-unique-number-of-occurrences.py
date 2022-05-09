class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        dict = {}
        for i in arr:
            dict[i] = 0
        for i in arr:
            dict[i] += 1
        if len(dict.values()) == len(set(dict.values())):
            return True
        return False
        
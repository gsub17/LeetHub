class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l = []
        for i in nums1:
            l.append(i)
        for i in nums2:
            l.append(i)
        l.sort()
        print(l)
        if(len(l)%2 == 0):
            x = len(l)//2 -1
            print(x)
            return (l[x]+l[x+1])/2
        x = len(l)//2 
        print(x)
        return l[x]
        
        
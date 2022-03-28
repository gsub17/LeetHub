class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        l1 = []
        l2 = []
        present = 0
        for i in range(0 , len(nums1) , 1):
            temp = nums1[i]
            for i in nums2:
                if i == temp:
                    present = 1
                    break
            if present == 0:
                l1.append(temp)
            present = 0
            
        for i in range(0 , len(nums2) , 1):
            temp = nums2[i]
            for i in nums1:
                if i == temp:
                    present = 1
                    break
            if present == 0:
                l2.append(temp)
            present = 0
        l4 = []
        l5 = []
        l3 = []
        
        if len(l1) != 0:
            x1 = set(l1)
            for i in x1:
                l4.append(i)
        else:
            l4 = l1
        if len(l2) != 0:
            x2 = set(l2)
            for i in x2:
                l5.append(i)
        else:
            l5 = l2
                
            
        l3.append(l4)
        l3.append(l5)
        return l3
    
        
                
        
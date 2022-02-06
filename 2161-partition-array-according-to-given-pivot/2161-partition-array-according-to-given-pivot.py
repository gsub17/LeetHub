class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        
        l1 = []
        for i in nums:
            if i < pivot:
                l1.append(i)
                
        l2 = []
        for i in nums:
            if i > pivot:
                l2.append(i)
                
        count = 0
        for i in nums:
            if i == pivot:
                count += 1
                
        l3 = []
        
        for i in range(count):
            l3.append(pivot)
            
        l4 = l1 + l3 + l2
        
        return l4
            
        
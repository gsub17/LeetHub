class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        
        n = len(nums)
        non_increasing = []
        non_decreasing = []
        
        for i in range(0,n,1):
            if i%2 != 0:
                non_increasing.append([i,nums[i]])
            else:
                non_decreasing.append([i,nums[i]])
                
        non_decreasing.sort(key = lambda x: x[1])
        
        l3 = []
        l4 = []
        
        for i in range(0, len(non_decreasing) , 1):
            index = non_decreasing[i][0]
            l3.append(index)
            value = non_decreasing[i][1]
            l4.append(value)
            
        l3.sort()
        l5 = []
        for i in range(0, len(l3) , 1):
            l5.append([l3[i] , l4[i]])
        print(l5)
         
        
        non_increasing.sort(key = lambda x: x[1])
        l2  = non_increasing[::-1]
        
        l6 = []
        l7 = []
        
        for i in range(0, len(l2) , 1):
            index = l2[i][0]
            l6.append(index)
            value = l2[i][1]
            l7.append(value)
            
        l6.sort()
        l8 = []
        for i in range(0, len(l2) , 1):
            l8.append([l6[i] , l7[i]])
            
        print(l8)
        
        l9 = l5 + l8
        l10 = nums
        
        for i in range(0 , n , 1):
            index = l9[i][0]
            value = l9[i][1]
            l10[index] = value
        
        
        print(l10)
    
            
        return l10
                
    
                
                
        
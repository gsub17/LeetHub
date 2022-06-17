#User function Template for python3

class Solution:
    def commonElements (self,A, B, C, n1, n2, n3):
        # your code here
        ans = []
        dict = {}
        
        for i in A:
            if i not in dict.keys():
                dict[i] = dict.get(i,0)+1
        for i in B:
            if dict.get(i) == 1:
                dict[i] = dict.get(i,0)+1
        for i in C:
            if dict.get(i) == 2 and i not in ans:
                ans.append(i)
        return ans
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3


t = int (input ())
for tc in range (t):
    n1, n2, n3 = list(map(int,input().split()))
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    C = list(map(int,input().split()))
    
    ob = Solution()
    
    res = ob.commonElements (A, B, C, n1, n2, n3)
    
    if len (res) == 0:
        print (-1)
    else:
        for i in range (len (res)):
            print (res[i], end=" ")
        print ()

# } Driver Code Ends
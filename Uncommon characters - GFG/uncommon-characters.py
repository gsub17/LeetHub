#User function Template for python3

class Solution:
    def UncommonChars(self,A, B):
        l1 = []
        for i in A:
            l1.append(i)
        
        l2 = []
        for i in B:
            l2.append(i)
            
        ans = ""
        for i in l1:
            if i in l2:
                continue
            elif i in ans:
                continue
            else:
                ans+=i
                
        for i in l2:
            if i in l1:
                continue
            elif i in ans:
                continue
            else:
                ans+=i
        
        if(len(ans) == 0):
            return -1
        
        x = sorted(ans)
        ans2 = ""
        for i in x:
            ans2+=i
        return ans2
        #code here

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())

    for tcs in range(T):
        A = input()
        B = input()
        ob = Solution()
        print(ob.UncommonChars(A, B))

# } Driver Code Ends
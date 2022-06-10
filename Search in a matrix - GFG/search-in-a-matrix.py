#User function Template for python3
class Solution:
	def matSearch(self,mat, N, M, X):
		# Complete this function
		l = []
		for a in mat:
		    l.append(a)
	#	print(l)
		
		for i in range(0 , len(l) , 1):
		    if(X in l[i]):
		        return 1
		return 0
		

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, m = map(int, input().split())
        
        arr = [int(x) for x in input().split()]
        x = int(input())
        mat = [[0 for j in range(m)] for i in range(n)]
        
        for i in range(n):
            for j in range(m):
                mat[i][j] = arr[i * m + j]
        ob = Solution()
        print(ob.matSearch(mat, n, m, x))
# } Driver Code Ends
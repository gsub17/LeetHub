#User function Template for python3
class Solution:

	def immediateSmaller(self,arr,n):
		# code here
		prev = arr[len(arr)-1]
		for i in range(len(arr)-2 , -1 , -1):
		    temp = arr[i]
		    if(arr[i] > prev):
		        arr[i] = prev
		    else:
		        arr[i] = -1
		    prev = temp
		arr[len(arr)-1] = -1
		
		     
		        
		    

#{ 
#  Driver Code Starts

if __name__ == '__main__':
    tcs=int(input())

    for _ in range(tcs):
        n=int(input())
        arr=[int(x) for x in input().split()]
        ob = Solution()
        ob.immediateSmaller(arr,n)
        for x in arr:
            print(x, end=" ")
        print()
# } Driver Code Ends
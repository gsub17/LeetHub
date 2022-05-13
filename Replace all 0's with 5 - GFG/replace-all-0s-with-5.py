# Function should return an integer value
def convertFive(n):
    # Code here
    l = []
    x = str(n)
    for i in x:
        if int(i) == 0:
            l.append(str(5))
        else:
            l.append(i)
    z = ""
    for i in l:
        z+=i
    return int(z)

#{ 
#  Driver Code Starts
# Your code goes here
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        print (convertFive(int(input().strip())))
# } Driver Code Ends
// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int[] temp = new int[m];
        temp = M[0];
        int ans = max_rectangle(temp);
         for(int i = 1 ; i < n ; i++){
            for(int  j = 0 ; j < m ;j++){
                if(M[i][j] == 1){
                    temp[j] +=1;
                }else{
                    temp[j] = 0;
                }
            
                
              //  System.out.println(ans);
            }
            ans = Math.max(max_rectangle(temp) , ans);
        }
        return ans;
        
    }
    
    public int max_rectangle(int[] hist){
         int[] prev_smaller = new int[hist.length];
        Stack<Integer> s1 = new Stack<>();
        
        int index = 0;
        
        for(int i = 0 ; i < hist.length ;i++){
            while( !s1.isEmpty() && hist[s1.peek()] >=  hist[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                prev_smaller[index] = -1;
            }else{
                prev_smaller[index] = s1.peek();
            }
            
            index++;
            s1.push(i);
        }
        
        int[] next_smaller = new int[hist.length];
        Stack<Integer> s2 = new Stack<>();
        index = hist.length - 1;
        
        for(int i = hist.length -1 ; i >= 0 ; i--){
            while(!s2.isEmpty() && hist[s2.peek()] >= hist[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                next_smaller[index] = hist.length;
            }else{
                next_smaller[index] = s2.peek();
            }
         //   System.out.println(next_smaller[index]);
            index--;
            s2.push(i);
        }
        
     
        long ans = 0;
        for(int i = 0 ; i < hist.length ; i++){
            long temp = (next_smaller[i] - prev_smaller[i] - 1)*hist[i];
            ans = Math.max(temp , ans);
        }
        int x = (int)ans;
        return x;
        
    }
}
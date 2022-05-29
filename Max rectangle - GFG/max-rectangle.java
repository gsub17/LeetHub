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
    public int maxArea(int matrix[][], int n, int m) {
        // add code here.
         int[] curr_row = matrix[0];
        int curr_max = max_histogram(curr_row);
   //     System.out.println(Arrays.toString(curr_row));
   //     System.out.println(curr_max);
        
        for(int i = 1 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                
                if(matrix[i][j] == 1){
                    curr_row[j]+=1;
                }else{
                    curr_row[j] = 0;
                }
            }
       //     System.out.println(Arrays.toString(curr_row));
            int temp = max_histogram(curr_row);
        //    System.out.println(temp);
            curr_max = Math.max(temp , curr_max);
            
        }
        return curr_max;
    }
    
     public int max_histogram(int[] heights){
       
        int[] prev_smaller = new int[heights.length];
        Stack<Integer> s1 = new Stack<>();
        int ans = 0;
        
        for(int i = 0 ; i < heights.length ; i++){
            while(!s1.isEmpty() && heights[s1.peek()] >= heights[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                prev_smaller[i] = -1;
            }else{
                prev_smaller[i] = s1.peek();
            }
            
            s1.push(i);
            
        }
        
        int[] next_smaller = new int[heights.length];
        Stack<Integer> s2 = new Stack<>();
        
        for(int i = heights.length - 1 ; i >=0 ; i--){
            while(!s2.isEmpty() && heights[s2.peek()] >= heights[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                next_smaller[i] = heights.length;
            }else{
                next_smaller[i] = s2.peek();
            }
            s2.push(i);
        }
        
        for(int i = 0 ; i < heights.length ; i++){
            int temp = (next_smaller[i] - prev_smaller[i] - 1) * heights[i];
            ans = Math.max(ans , temp);
        }
        return ans;
        
    }
}
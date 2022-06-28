// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
     public void dfs(char[][] grid , int i , int j , int row , int col){
        if(i >= row || j >= col || i < 0 || j < 0||  grid[i][j] != '1'){
            return;
        }
        
        grid[i][j] = '2';
        
        dfs(grid , i + 1 , j , row , col);
        dfs(grid , i , j +1 , row , col);
        dfs(grid , i - 1 , j , row , col);
        dfs(grid , i , j - 1 , row , col);
        dfs(grid , i-1 , j -1 , row , col);
        dfs(grid , i+1 , j+1 , row , col);
        dfs(grid , i-1 , j +1 , row , col);
        dfs(grid , i +1 , j -1 , row , col);
        return;
        
    }
    public int numIslands(char[][] grid) {
        // Code here
         int row = grid.length;
        if(row == 0) return 0;
        
        int col = grid[0].length;
        
        int no_of_islands = 0;
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid , i , j,row ,col);
                    no_of_islands +=1;
                }
            }
        }
        
        return no_of_islands;
    }
}
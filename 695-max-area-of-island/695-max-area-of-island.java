class Solution {
    
    int ans2 = 0;
    public void dfs(int[][] grid , int i , int j , int row , int col){
      if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1){
          return;
      }    
      
        ans2++;
        grid[i][j] = 2;
        
        dfs(grid , i+ 1,j,row , col);
        dfs(grid , i , j+1 , row,col);
        dfs(grid , i-1 , j , row ,col);
        dfs(grid , i,j-1,row,col);
        return;
        
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int ans = 0;
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    dfs(grid , i , j , row , col);
                    
                    ans = Math.max(ans , ans2);
                    ans2 = 0;
                }
            }
        }
        
        return ans;
    }
}
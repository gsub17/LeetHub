class Solution {
    
    
    public void dfs(char[][] grid , int i , int j , int row , int col){
        if(i >= row || j >= col || i < 0 || j < 0||  grid[i][j] != '1'){
            return;
        }
        
        grid[i][j] = '2';
        
        dfs(grid , i + 1 , j , row , col);
        dfs(grid , i , j +1 , row , col);
        dfs(grid , i - 1 , j , row , col);
        dfs(grid , i , j - 1 , row , col);
        return;
        
    }
    public int numIslands(char[][] grid) {
        
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
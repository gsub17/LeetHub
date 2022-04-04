class Solution {
    
    List<List<String>> ans = new ArrayList<List<String>>();
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        placethequeen(board , 0 , n);
        return ans;
    }
    
    public void placethequeen(char[][] board , int cr , int queen){
        if(cr == queen){
            List<String> ans2 = new ArrayList<>();
            for(int i = 0 ; i < queen ; i++){
                String s = "";
            for(int j = 0 ; j < queen ; j++){
                s = s + board[i][j];
            }
                ans2.add(s);
        }
            ans.add(ans2);
            return ;
            
        }
        
        for(int cc = 0 ; cc < queen ; cc++){
            if(issafe(board , cr , cc , queen)){
                board[cr][cc] = 'Q';
                placethequeen(board , cr+1 , queen);
                board[cr][cc] = '.';
            }
        }
        return ;
    }
    
    public boolean issafe(char[][] board , int cr , int cc , int queen){
        
        for(int row = 0 ; row < queen ; row++) {
			if(board[row][cc] == 'Q') {
				return false;
			}
		}
        
        int row = cr;
		int col = cc;
		
		while(row >= 0 && col >= 0) {
			if(board[row][col] == 'Q') {
				return false;
			}
			row--;
			col--;
		}
		
		// checking right diagonal
		row = cr;
		col = cc;
		
		while(row >= 0 && col < queen) {
			if(board[row][col] == 'Q') {
				return false;
			}
			row--;
			col++;
		}
		
		return true;
        
    }
}
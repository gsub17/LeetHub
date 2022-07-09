class Solution {
    public int maximalRectangle(char[][] m) {
        
        int[][] matrix = new int[m.length][m[0].length];
        for(int i = 0 ; i < m.length ;i++){
            for(int j = 0 ; j < m[0].length ; j++){
                matrix[i][j] = m[i][j] - '0';
            }
        }
        
        int[] temp = new int[matrix[0].length];
        for(int i = 0 ; i < matrix[0].length ; i++){
            temp[i] = matrix[0][i];
        }
        
        int ans = nse_pse(temp);
        
        for(int i = 1 ; i < m.length ;i++){
            for(int j = 0 ; j < m[0].length ;j++){
                if(matrix[i][j] == 1){
                    temp[j] += 1;
                }else{
                    temp[j] = 0;
                }
            }
            int ans2 = nse_pse(temp);
            ans = Math.max(ans2 , ans);
        }
        return ans;
    }
    
    public int nse_pse(int[] temp){
        Stack<Integer> s1 = new Stack<>();
        int[] nse = new int[temp.length];
        
        for(int i = temp.length - 1 ; i >= 0 ; i--){
            while(!s1.isEmpty() &&  temp[s1.peek()] >= temp[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                nse[i] = temp.length;
            }else{
                nse[i] = s1.peek();
            }
            
            s1.push(i);
        }
        
        Stack<Integer> s2 = new Stack<>();
        int[] pse = new int[temp.length];
        
        for(int i = 0 ; i< temp.length ;i++){
            while(!s2.isEmpty() && temp[s2.peek()] >= temp[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = s2.peek();
            }
            s2.push(i);
        }
        int ans = 0;
        for(int i = 0 ; i < temp.length ;i++){
            ans = Math.max(ans , (nse[i] - pse[i] - 1)*temp[i]);
        }
        return ans;
    }
    
    
}
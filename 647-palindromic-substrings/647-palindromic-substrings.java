class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String temp = s.substring(i,j);
                int p = 0;
                int q = temp.length() - 1;
                boolean check = true;
                while(p < q){
                   if(temp.charAt(p) != temp.charAt(q)){
                       check = false;
                       break;
                   }
                    p++;
                    q--;
                }
                
                if(check){
                    count++;
                }
            }
        }
        return count;
    }
}
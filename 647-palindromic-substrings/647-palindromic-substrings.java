class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String temp = s.substring(i,j);
                int x = 0;
                int y = temp.length() -1;
                boolean check = true;
                while(x < y){
                    if(temp.charAt(x) != temp.charAt(y)){
                        check = false;
                        break;
                    }
                    x++;
                    y--;
                }
                if(check) {
                    count++;
                  //  System.out.println(temp);
                }
                    
            }
        }
        return count;
    }
    
}
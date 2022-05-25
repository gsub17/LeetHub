class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ;i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String temp = s.substring(i ,j );
                int s1 = 0;
                int e1 = temp.length()-1;
                boolean check = false;
                while(s1 < e1){
                    char x = temp.charAt(s1);
                    char y = temp.charAt(e1);
                    if(x != y){
                        check = true;
                        break;
                    }
                    s1++;
                    e1--;
                }
                if(!check){
                   // System.out.println(temp);
                    count++;
                }
            }
        }
        return count;
        
    }
}
class Solution {
    public int countSubstrings(String s) {
        
       
        ArrayList<String> ans = new ArrayList<>();
        ans = substring(s ,ans );
        return ans.size();
    }
    
   public ArrayList<String> substring(String s , ArrayList<String> ans){
       for(int i = 0 ; i < s.length() ; i++){
           for(int j = i+1 ; j <= s.length() ; j++){
              String n1 = s.substring(i , j);
              if(palindrome(n1)){
                  ans.add(n1);
              }
           }
       }
       return ans;
   }
    
   public boolean palindrome(String n1){
       int i = 0 ;
       int j = n1.length() -1;
       while(i < j){
           if(n1.charAt(i) != n1.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
   }
}
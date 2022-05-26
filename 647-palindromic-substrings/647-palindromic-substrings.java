class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String temp = s.substring(i,j);
                int p = 0;
                int q= temp.length()-1;
                boolean check = false;
                while(p < q){
                    if(temp.charAt(p) != temp.charAt(q)){
                        check = true;
                        break;
                    }
                    p++;
                    q--;
                }
                if(!check){
                    ans++;
                }
            }
        }
        return ans;
    }
}
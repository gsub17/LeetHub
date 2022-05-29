class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        
        for(int i = 0 ; i < words.length-1 ; i++){
            char[] c1 = words[i].toCharArray();
            HashSet<Character> set = new HashSet<>();
            
            for(char a: c1){
                set.add(a);
            }
            
            for(int j = i+1 ; j < words.length ; j++ ){
                char[] c2 = words[j].toCharArray();
                boolean check = true;  // assuming different string
                for(char b:c2){
                    if(set.contains(b)){
                        check = false;
                        break;     
                    }
                }
                if(check){
                    int length = c1.length * c2.length;
                    max = Math.max(length , max);
                }
            }
        }
        return max;
    }
}
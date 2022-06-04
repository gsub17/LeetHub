class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for(int i = 0 ; i < S.length() ; i++){
            char x = S.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                s.push(x);
                count++;
            }else if(!s.isEmpty()){
                if(s.peek() == '(' && x == ')'){
                    s.pop();
                }else if(s.peek() == '{' && x == '}'){
                    s.pop();
                }else if(s.peek() == '[' && x == ']'){
                    s.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        if(s.isEmpty()){
            return true;
        }
        
        return false;
    }
}
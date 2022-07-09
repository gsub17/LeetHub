class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        char[] arr = S.toCharArray();
        int count = 0;
        for(int i = 0 ; i < S.length() ; i++){
            char c = arr[i];
            
            if(c == '(' || c == '{' || c == '['){
                s.push(c);
                count++;
            }else{
                if(!s.isEmpty()){
                    if(c == '}' && s.peek() == '{'){
                        s.pop();
                    }else if(c == ']' && s.peek() == '['){
                        s.pop();
                    }else if(c == ')' && s.peek() == '('){
                        s.pop();
                    }
                }
                count--;
            }
        }
        
        if(s.isEmpty() && count == 0){
            return true;
        }
        return false;
    }
}
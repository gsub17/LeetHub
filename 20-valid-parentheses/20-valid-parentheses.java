class Solution {
    public boolean isValid(String x) {
         int count = 0;
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < x.length() ; i++){
            char c = x.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                s.push(c);
                count++;
            }else if(!s.isEmpty()){
                if(s.peek() == '[' && c == ']'){
                    s.pop();
                    count++;
                }else if(s.peek() == '{' && c == '}'){
                    s.pop();
                    count++;
                }else if(s.peek() == '(' && c == ')'){
                    s.pop();
                    count++;
                }
            }
        }
        if(s.isEmpty() && count == x.length()){
            return true;
        }
        return false;
    }
}
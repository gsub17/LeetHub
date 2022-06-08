class MyStack {
    ArrayDeque<Integer> aq ;

    public MyStack() {
        aq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        aq.add(x);
    }
    
    public int pop() {
        return aq.removeLast();
    }
    
    public int top() {
        return aq.peekLast();
    }
    
    public boolean empty() {
        if(aq.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
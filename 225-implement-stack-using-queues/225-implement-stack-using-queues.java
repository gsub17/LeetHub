class MyStack {
    ArrayDeque<Integer> aq ;

    public MyStack() {
        aq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        aq.push(x);
    }
    
    public int pop() {
        return aq.removeFirst();
    }
    
    public int top() {
        return aq.peekFirst();
    }
    
    public boolean empty() {
        if(aq.isEmpty()){
            return true;}
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
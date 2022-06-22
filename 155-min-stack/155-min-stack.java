
class MinStack {
    ArrayDeque<Integer> aq ;
    public MinStack() {
        aq = new ArrayDeque<>();
    }
    
    public void push(int val) {
        
        aq.add(val);
    }
    
    public void pop() {
        aq.removeLast();
    }
    
    public int top() {
        return aq.peekLast();
    }
    
    public int getMin() {
        return Collections.min(aq);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
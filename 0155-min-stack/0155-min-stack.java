class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> ministack;

    public MinStack() {
        stack = new Stack<>();
        ministack = new Stack<>();
    }
    
    public void push(int value) {
        stack.add(value);
        
        if(ministack.isEmpty()){
            ministack.add(value);
        }
        else{
            if(value<ministack.peek()){
                ministack.add(value);
            }
            else{
                ministack.add(ministack.peek());
            }
        }
    }
    
    public void pop() {
        stack.pop();
        ministack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return ministack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
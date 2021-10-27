class MinStack {
    
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    

    public MinStack() {
         
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        
        mainStack.push(val);
        if(minStack.size() == 0){
            minStack.push(val);
        }else{
            if(minStack.peek() >= val){
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        
        int elem = mainStack.pop();
        if(elem == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

// Using One stack only
class MinStack {
    
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
      long elem = Long.valueOf(val);
        if(stack.isEmpty()){
            min = elem;
            stack.push(elem);
            return;
        }
        
        if(elem < min){
            stack.push(elem + (elem - min));
            min = elem;
        }else{
            stack.push(elem);
        }
        
        
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        
        long elem = stack.pop();
        if(elem < min){
            min = 2 * min - elem;
        }
    }
    
    public int top() {
     long elem = stack.peek();
        if(elem > min){
            return (int)elem;
        }else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

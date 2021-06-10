// space Complexity is O(N)
class MinStack {
   
    Stack<Integer> stack;
    Stack<Integer> minStack;
    
   
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
       
    }
    
    public void push(int val) {
       stack.push(val);
         if(minStack.size() == 0){
           minStack.push(val);
        }else{
             if(val <= minStack.peek()){
                 minStack.push(val);
             }
             
         }
    }
    
    public void pop() {
        int temp = stack.pop();
        if(temp == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
       
        return minStack.peek();
    }
}



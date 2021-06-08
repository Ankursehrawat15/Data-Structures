// Push o(1) -- Pop o(1) -- Increment O(K)
// My Approach
class CustomStack {
   int [] arr;
    int top;
   int size;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        size = 0;
        top = -1;
        
    }
    
    public void push(int x) {
        if(size == arr.length){
            return;
        }
            top++;
            arr[top] = x;
            size++;
     }
    
    public int pop() {
        if(size == 0){
            return -1;
        }
            int temp = arr[top];
              top--;
            size--;
         return temp;
       
    }
    
    public void increment(int k, int val) {
      if(size < k){
          for(int i=0;i<arr.length;i++){
              arr[i] = arr[i] + val;
          }
      }else{
           for(int i=0;i<k;i++){
              arr[i] = arr[i] + val;
          }
      }
    }
}

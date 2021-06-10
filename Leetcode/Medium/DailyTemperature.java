// Time Complexity O(N^2) and Space Complexity O(N)
 public int[] dailyTemperatures(int[] arr) {
        int [] newArr = new int[arr.length];
     for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j<arr.length;j++){
             
             if(arr[j] > arr[i]){
                 newArr[i] = j - i;
                 break;
             }
         }
     }
        
        return newArr;
        
}

// Time complexity O(N) and space Complexity O(N)
  public int[] dailyTemperatures(int[] arr) {
        int [] newArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            
            while(stack.size() > 0 && arr[i] > arr[stack.peek()]){
                int val = stack.pop();
                newArr[val] = i - val;
            }
            
            stack.push(i);
            
        }
        
        return newArr;
        
}

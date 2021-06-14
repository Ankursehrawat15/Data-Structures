// time Complexitiy O(N^2)
public int[] nextLargerNodes(ListNode head) {
        if(head == null) {
            int [] ans = new int[0];
            return ans;
        }
        ArrayList<Integer> list = new ArrayList<>();
       
        ListNode node = head;
        while(node != null){
            ListNode nextGreater = node.next;
            int count = 0;
            while(nextGreater != null ){
                if(nextGreater.val > node.val){
                    list.add(nextGreater.val);
                    count++;
                    break;
                }
                
                nextGreater = nextGreater.next;
            }
            
            if(count == 0){
                list.add(0);
            }
            
            
            
            node = node.next;
        }
        
         int [] ans = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        
        
        return ans;
        
        
        
    }


// Approach 2nd using Stacks
   // creates Array of linkedList
public int[] nextLargerNodes(ListNode head) {
      
    ArrayList<Integer> list = new ArrayList<>();
          ListNode node = head;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
    
        int [] ans = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ans.length;i++){
            
            while(!stack.isEmpty() && list.get(i) > list.get(stack.peek())){
                
                ans[stack.pop()] = list.get(i);
            }
            
            stack.push(i);
        }
        
         return ans;
             
   }

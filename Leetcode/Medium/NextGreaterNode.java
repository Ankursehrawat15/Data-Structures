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
   public int[] createArray(ListNode head){
     ArrayList<Integer> list = new ArrayList<>();
          ListNode node = head;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        
        int [] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
       
       return ans;
    }
     // finding next Greater Element
public int[] nextLargerNodes(ListNode head) {
        if(head == null){
            return new int[0];
        }
    
        int [] ans = createArray(head);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ans.length;i++){
            
            while(!stack.isEmpty() && ans[i] > ans[stack.peek()]){
                int index = stack.pop();
                ans[index] = ans[i];
            }
            
            stack.push(i);
        }
        
        
     if(stack.size() != 0){
         while(stack.size() > 0){
             ans[stack.pop()] = 0;
         }
         
     } 
         return ans;
             
   }

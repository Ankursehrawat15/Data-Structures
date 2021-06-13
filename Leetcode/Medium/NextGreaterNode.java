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

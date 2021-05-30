// Approach 1 
   public ListNode middleNode(ListNode head) {
       
       ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp = head;
        int mid = length/2;
      int i = 0;
        while(i < mid ){
            temp = temp.next;
            i++;
        }
        
        return temp;
    }

// By Fast and Slow pointer

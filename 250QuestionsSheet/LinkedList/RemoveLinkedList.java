 public ListNode removeElements(ListNode head, int val) {
        
       if(head == null) return head;
        
        ListNode checked = removeElements(head.next ,val);
        
        
        if(val == head.val){
            return checked;
        }else{
            head.next = checked;
            return head;
        }
        
        
    }


  public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        ListNode curr = head;
        while(curr != null){
            
            if(curr.val != val){
                tail.next = curr;
                tail = tail.next;
            }
            
            curr = curr.next;
            
        }
        
        tail.next = null;
      
        return dummy.next;
        
        
        
    }

    // finding mid value 
   public ListNode mid(ListNode head){
        ListNode slow = head;
       ListNode fast = head;
       
       while(fast.next != null && fast.next.next != null){
           
           fast = fast.next.next;
           slow = slow.next;
       }
       ListNode temp = slow.next;
       slow.next = null;
       return temp;
   }
    
    // reversing from mid
    public ListNode reverse(ListNode head){
     
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    
    // combining the two lists
    public void reorderList(ListNode head) {
       if(head == null || head.next == null) return;
        
        ListNode mid = mid(head);
        ListNode head2 = reverse(mid);
       
        ListNode curr1 = head;
        ListNode curr2 = head2;
        
        
        while(curr1 != null && curr2 != null){
            ListNode temp1 = curr1.next;
            ListNode temp2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = temp1;
            curr1 = temp1;
            curr2 = temp2;
        }
        
        
        if(curr2 != null){
            ListNode tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            
            tail.next = curr2;
            curr2.next = null;
        }
        
       
    }

public ListNode reverseList(ListNode head) {
        // recursive way of reversing 
        
        if(head == null || head.next == null ) return head;
        
        ListNode tail = head.next;
        ListNode finalHead = reverseList(head.next);
      
        tail.next = head;
        head.next = null;
       
        return finalHead;
        
    }
 public ListNode sortList(ListNode head) {
        
     if(head == null || head.next == null){
         return head;
     }   
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;
        
        ListNode leftList = sortList(head);
        ListNode rightList = sortList(slow);
        
        return merge(leftList , rightList);
        
        
        
    }
    
    public ListNode merge(ListNode l1 , ListNode l2){
        
      ListNode mergeList = new ListNode(-1);
        ListNode curr = mergeList;
        
        while(l1!= null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        
        
        if(l1 != null){
            curr.next = l1;
            
        }else{
            curr.next = l2;
        }
        
        
        
        
        return mergeList.next;
        
        
        
      
        
    }

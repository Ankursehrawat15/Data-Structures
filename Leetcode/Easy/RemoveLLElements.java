LINK: https://leetcode.com/problems/remove-linked-list-elements/
// Approach 1 via recursion 
  public ListNode removeElements(ListNode head, int val) {
        
     if(head == null) return head;
        
      head.next = removeElements(head.next , val);
        return head.val == val ? head.next : head;
      
        
    }

// Approach 2 iterative 
 if(head == null) return head;
    ListNode temp = head;
    while(temp.next != null){
        if(temp.next.val == val) temp.next = temp.next.next;
        else temp = temp.next;
    }
    
    return head.val == val ? head.next : head;
}

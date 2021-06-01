LINK: https://leetcode.com/problems/remove-linked-list-elements/
// Approach 1 via recursion 
  public ListNode removeElements(ListNode head, int val) {
        
     if(head == null) return head;
        
      head.next = removeElements(head.next , val);
        return head.val == val ? head.next : head;
      
        
    }

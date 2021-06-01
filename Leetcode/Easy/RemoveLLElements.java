LINK: https://leetcode.com/problems/remove-linked-list-elements/
// Approach 1 via recursion 
  public ListNode removeElements(ListNode head, int val) {
        
     if(head == null) return head;
        
        ListNode sub = removeElements(head.next , val);
        if(head.val == val){
            return sub;
        }else{
            head.next = sub;
            return head;
        }
        
    }

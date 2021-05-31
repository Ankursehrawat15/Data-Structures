// Time complexity is O(N^2) 
public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode last = head.next;
        
        ListNode reversed = reverseList(head.next);
        ListNode temp = reversed;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = head;
        head.next = null;
        
        
        return reversed;
        
    }


// better approach (eleminating the traversal after smaller reversal)
  public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode last = head.next;
        
        ListNode reversed = reverseList(head.next);
        ListNode temp = reversed;
       
        
        last.next = head;
        head.next = null;
        
        
        return reversed;
        
    }


// Iterative Approach
 public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;
         
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

/*
  My Approach :
  a) finding the length of linked list 
  b) traversing until length > n + 1
  c) removing that node and returning the node
  
 

*/

   
    public int length(ListNode head){
        if(head == null) return 0;
        
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        return length;
    }
    
    
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null && n == 1) return null;
        int length = length(head);
        
        if(length == n) return head.next;
        
        ListNode curr = head;
        while(length > n+1){
            
            curr = curr.next;
            
            length--;
        }
        
        ListNode temp = curr.next;
        curr.next = temp.next;
        return head;
        

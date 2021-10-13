// time  complexity is O(N) and space is O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        
        while(curr != null){
            
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        
        return prev;
        
        
    }
}



// recursive approach tc o(N) and space is o(N)
  public ListNode reverseList(ListNode head) {
        
     if(head == null || head.next == null) return head;
        
        ListNode secondLast_head = head.next;
        
        ListNode newHead = reverseList(head.next);
        
            secondLast_head.next = head;
        head.next = null;
        
        return newHead;
        
    }

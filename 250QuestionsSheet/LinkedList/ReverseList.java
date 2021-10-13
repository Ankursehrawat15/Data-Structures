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

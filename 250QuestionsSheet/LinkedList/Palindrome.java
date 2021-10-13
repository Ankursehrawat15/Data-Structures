/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Time complexity is O(N) and Space complexity is O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {
       
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode temp = null;
         prev = slow;
         slow = slow.next;
          prev.next = null;
        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        
        fast = head;
        
        while(fast != null && prev != null){
            
            if(fast.val != prev.val){
                return false;
            }
            
            fast = fast.next;
            prev = prev.next;
        }
        
        
        return true;
        
        
        
        
        
        
        
        
        
    }
}

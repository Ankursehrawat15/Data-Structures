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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return head;
        
        ListNode dummyNode = new ListNode(-1);
        int prev = Integer.MIN_VALUE;
        ListNode tail = dummyNode;
        
        while(head != null){
          
            if(head.val != prev){
                prev = head.val;
                tail.next = head;
                tail = tail.next;
            }
            
            head = head.next;
          
        }
        
        tail.next = null;
        
        return dummyNode.next;
    }
}

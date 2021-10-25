/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        
        ListNode pointer = null;
        ListNode temp = node;
        while(temp != null && temp.next != null){
            
                if(temp.next.next == null){
                    pointer = temp;
                }
            
            int data = temp.val;
            temp.val = temp.next.val;
            temp.next.val = data;
            
            
            temp = temp.next;
        }
        
        
        pointer.next = null;
        
        
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        HashSet<ListNode> checked = new HashSet<>();
        
        while(head != null){
            
            if(checked.contains(head)){
                return true;
            }
            
            checked.add(head);
            head = head.next;
        }
        
        return false;
        
        
    }
}

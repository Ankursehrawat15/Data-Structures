/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    // 1. find the length of the both the linked lists 
   private int length(ListNode head){
        
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        return len;
    }
    
    // 3.  start traversing and check for the same address of nodes
    private ListNode intersection(ListNode headA , ListNode headB){
         
        
        while(headA != null && headB != null){
            
            if(headA == headB){
                return headA;
            }
            
            headA = headA.next;
            headB = headB.next;
        }
        
        
        return null;
        
    }
     // 2.  bigger length - smaller one = starting point.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        
        int lenA = length(headA);
        int lenB = length(headB);
         
        if(lenA > lenB){
            
            int skip = lenA - lenB;
            while(skip != 0 && headA != null){
                headA = headA.next;
                skip--;
            }
            
        }else{
               int skip = lenB - lenA;
            while(skip != 0 && headB != null){
                headB = headB.next;
                skip--;
            }
        }
        
        return intersection(headA , headB);
         
    }
}

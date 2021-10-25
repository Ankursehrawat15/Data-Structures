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

// Consize solution
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
    
 
    // 3.  start traversing and check for the same address of nodes
    private ListNode intersection(ListNode headA , ListNode headB){
         
        ListNode listNode1 = headA;
        ListNode listNode2 = headB;
        while(headA != headB){
            
            if(headA == null){
                headA= listNode2;
            }else{
                headA = headA.next;
            }
            
            if(headB == null){
                headB = listNode1;
            }else{
                headB= headB.next;
            }
            
        }
        
        
        return headA;
        
    }
     // 2.  bigger length - smaller one = starting point.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        
        return intersection(headA , headB);
         
    }
}

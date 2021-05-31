 // LINK: https://leetcode.com/problems/merge-two-sorted-lists/
// Approach is fine but code quality matters  
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        if(l1 == null || l2 == null) return  l1 == null ? l2 : l1;
        
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode head = null , tail = null;
        
        while(list1 != null && list2 != null){
            
            if(list1.val <= list2.val){
                if(head == null){
                    head = list1;
                    tail = list1;
                }else{
                
                tail.next = list1;
                tail = tail.next;
              
                }
                  list1 = list1.next;
            }else{
                if(head == null){
                    head = list2;
                    tail = list2;
                }else{
                tail.next = list2;
                tail = tail.next;
              
                }
                  list2 = list2.next;
  
          }
        }
        
        if(list1 == null){
            tail.next = list2;
        }else if (list2 == null){
            tail.next = list1;
        }
        
        
        return head;
        
        
    }

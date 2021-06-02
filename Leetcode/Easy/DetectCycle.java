// Floyd's Detection Algorithm
public boolean hasCycle(ListNode head) {
        // Time complexity O(N)
       ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast ){
                return true;
            }
        }
     
        return false;
}

// Using HashMaps

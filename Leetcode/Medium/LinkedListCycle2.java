// using HashMaps Time Complexity O(N) and Space Complecity O(n) 
public ListNode detectCycle(ListNode head) {
        HashMap<ListNode , Boolean> map  = new HashMap();
        
        ListNode temp = head;
        while(temp != null){
            
            if(map.containsKey(temp)){
                return temp;
            }
             map.put(temp , true);
             temp = temp.next;
        }
             return null;
        
    }

// Approach 1 --> Time complexity O(N)
public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    
    ListNode rest = list1;
        int i = 0;
        while(i < b){
            rest = rest.next;
            i++;
        }
        
       
        rest = rest.next;
    
    ListNode temp = list1;
        i = 0;
        while(i < a-1){
            temp = temp.next;
            i++;
        }
        temp.next = list2;
     temp = list1;
        while(temp.next != null){
            temp = temp.next;
        }
        if(rest != null){
        temp.next = rest;
        }
        return list1;
        
        
        
    }

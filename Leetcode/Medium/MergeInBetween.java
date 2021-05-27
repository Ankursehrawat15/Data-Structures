// Approach 1 --> Time complexity O(N)
public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    
    ListNode currentNode = list1;
ListNode bthNode = null;
ListNode athNode = null;
    int i =0;
    while(currentNode != null){
        
        if(i == a-1){
            athNode = currentNode;
        }
        
        if(i == b){
            bthNode = currentNode.next;
        }
        
        
        i++;
        currentNode = currentNode.next;
        
        
    }
    
    ListNode temp = list2;
  
    while(temp.next != null){
        temp = temp.next;
      
    }
    temp.next = bthNode;
   athNode.next = list2;
  
  
    return list1;
    
    
    
}

    
   

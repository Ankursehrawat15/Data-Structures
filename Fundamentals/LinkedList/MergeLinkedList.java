// Merge Two Sorted Linked List

// Time Complexity ==> o(n + m)
static Node<Integer> mergeLinkedList(Node<Integer> head1 , Node<Integer> head2){
		
		Node<Integer> l1= head1;
		Node<Integer> l2= head2;
		if(l1 == null || l2 == null) return l1==null ? l1 : l2;
		Node<Integer> newList = new Node<>(-1);
		Node<Integer> tail = newList;
		while(l1 != null && l2 != null) {
			
			if(l1.data < l2.data) {
				
				tail.next = l1;
				l1 = l1.next;
				
			}else {
				
				tail.next = l2;
				l2 = l2.next;
			}
			
			tail = tail.next;
		}
		
		tail.next = l1 != null ? l1 : l2;
		
		
		return newList.next;
		
		
		
		
		
		
	}



// another approach 
 public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
       
        LinkedListNode<Integer> l1= head1;
         LinkedListNode<Integer> l2= head2;
        
        if(l1 == null || l2 == null) return l1 == null ? l2 : l1;
        
        
           LinkedListNode<Integer> head = null , tail = null;
       
        if(l1.data < l2.data){
            head = l1;
            tail = l1;
            l1 = l1.next;
        }else{
            head = l2;
            tail = l2;
            l2 = l2.next;
        }
        
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        
        tail.next = l1 != null ? l1 : l2;
        
        return head;
     
        
       
      
       
    }
	

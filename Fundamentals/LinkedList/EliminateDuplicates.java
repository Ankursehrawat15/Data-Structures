	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		
        if(head == null ){
            return head;
        }
        
        LinkedListNode<Integer> currHead = head;
        while(currHead.next != null ){
            
            if(currHead.data.equals(currHead.next.data)){
                currHead.next = currHead.next.next;
            }
            else{
                currHead = currHead.next;
            }
        }
        
        return head;
        
     
        
    
        
	}

static int midPoint(Node<Integer> head ) {
		
		Node<Integer> temp = head;
		int length = 0;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		
		int mid = (length-1) / 2;
		
		Node<Integer> midNode = head;
		int count = 0;
		while(count != mid) {
			
			
			midNode = midNode.next;
			count++;
		}
		
		return midNode.data;
		
		
		
		
		
	}

//
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        
        
        if(head == null ){
          return head;    
            }
        LinkedListNode<Integer> tail = head;
        while(tail.next != null){
            
            tail = tail.next;
        }
        
        
        LinkedListNode<Integer> slow = head;
           LinkedListNode<Integer> fast = head;
        
        while(fast.next != null ){
            
            if(fast.next == tail){
                return slow;
            }
            
            slow = slow.next;
            fast =fast.next.next;
            
            
        }
        
        return slow;
        
        
       
       
    }

	

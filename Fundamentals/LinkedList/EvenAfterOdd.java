	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        
     if(head == null || head.next == null) return head;
        
        
        
      LinkedListNode<Integer> oddHead = null , oddTail = null;
        LinkedListNode<Integer> evenHead = null , evenTail = null;
        LinkedListNode<Integer> temp = head;
      
        while(temp != null){
            
            if(!(temp.data % 2==0)){
              if(oddHead == null){
                oddHead = temp;
                oddTail = temp;
              
                }else{
                oddTail.next = temp;
                oddTail = oddTail.next;
               
            }    
            }else{
                
                if(evenHead == null){
                    evenHead = temp;
                    evenTail = temp;
                   
                }
                else{
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                 
                }
                
            }
              temp = temp.next;
               
            
        }
      
        if(oddHead == null){
            return evenHead;
        }else{
            oddTail.next = evenHead;
        }
        
        if(evenHead != null){
            evenTail.next = null;
        }
        
        return oddHead;
       
        

		

	}

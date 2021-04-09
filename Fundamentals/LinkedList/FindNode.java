public static int findNode(LinkedListNode<Integer> head, int n) {
		
        if(head == null){
            return -1;
        }
        
        LinkedListNode<Integer> temp = head;
        int pos = 0;
        while(temp.next != null){
        
            if(temp.data.equals(n)){
                return pos;
            }else{
                pos++;
                temp = temp.next;
            }
            
        }
        
        return -1;
	}

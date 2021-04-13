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

// recursivly 
public static int findNodeRec(LinkedListNode<Integer> head, int n, int index) {
    	if(head == null || head.next == null ) return -1;
    
    if(head.data == n){
        return index;
    }
    int smallAns = findNodeRec(head.next , n , index+1);
    
    return smallAns;
	}

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	return findNodeRec(head , n , 0);
	}

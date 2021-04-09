  public static void printReverse(LinkedListNode<Integer> root , LinkedListNode<Integer> temp) {
        
       if(temp == null){
           return;
       }
        
        printReverse(root , temp.next);
        System.out.print(temp.data+" ");
      
		
	}

	public static void printReverse(LinkedListNode<Integer> root) {
        
        LinkedListNode<Integer> temp = root;
        
        printReverse(root , temp);
		
	}

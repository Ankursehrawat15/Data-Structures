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
	

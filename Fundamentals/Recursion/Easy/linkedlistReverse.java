 public static Node<Integer> recursive(Node<Integer> head){
    	if(head == null || head.next == null){
    		return head;
    	}

        Node<Integer> tail = head.next;
    	Node<Integer> smallAns = recursive(head.next);
    	tail.next = head;
    	head.next = null;

    	return smallAns;

    }


public static Node<Integer> reverse(Node<Integer> head){
      
      if(head == null || head.next == null){
      	return head;
      }

      Node<Integer> smallAns = reverse(head.next);
      Node<Integer> temp = smallAns;
      while(temp.next != null){
      	temp = temp.next;
      }

      temp.next = head;
      head.next = null;

      return smallAns;

}


public static Node<Integer> insert(Node<Integer> head , int data , int position) {
		
		Node<Integer> newNode = new Node<>(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int i=0;
		Node<Integer> temp = head;
		while(i < position-1) {
			temp = temp.next;
			i++;
			
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
		
	}

// class for which creates nodes

 class Node <T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}

}

public class LinkedListUse {
	
	
	public static void print(Node<Integer> head) {
		
		while(head != null) {
			
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}
	

	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node<>(20);
		Node<Integer> node2 = new Node<>(30);
		Node<Integer> node3 = new Node<>(50);
		
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = node1;
		print(head);
	}

}

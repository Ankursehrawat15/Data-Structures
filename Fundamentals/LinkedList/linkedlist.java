// class for which creates nodes

 class Node <T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}

}
 // method for taking input in linked list
// Time Complexity => o(n*2)

public static Node<Integer> takeInput() {

		Node<Integer> head = null;

		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();

		while (data != -1) {

			Node<Integer> newNode = new Node<>(data);
			if (head == null) {
				head = newNode;
			} else {
				Node<Integer> temp = head;
				while (temp.next != null) {

					temp = temp.next;
				}

				temp.next = newNode;

			}

			data = scan.nextInt();

		}

		return head;
	}

// method for printing the linkedlist

	public static void print(Node<Integer> head) {

		while (head != null) {

			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		print(head);

	}

}

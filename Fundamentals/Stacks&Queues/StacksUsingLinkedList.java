private Node<T> head;
	private int size;

	public StackUsingll() {
		head = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public T top() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}
		return head.data;

	}

	public void push(T elem) {
		Node<T> newNode = new Node<>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public T pop() throws StackEmptyException {
		if (size() == 0) {
			throw new StackEmptyException();
		}

		T elem = head.data;
		head = head.next;

		return elem;

	}

private int[] data;
	private int top;

	public StackUsingArray(int capacity) {
		this.data = new int[capacity];
		this.top = -1;

	}

	public StackUsingArray() {
		this.data = new int[10];
		this.top = -1;
	}

	public int size() {
		return top + 1;

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int top() throws StackEmptyException {
		if (size() == 0) {
			// StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int elem) throws StackFullException {
		if (size() == data.length) {
			// StackFullException
			StackFullException e = new StackFullException();
			throw e;
		}

		top++;
		data[top] = elem;

	}

	public int pop() throws StackEmptyException {
		if (size() == 0) {
			// StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;

	}

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		if (head == null || n == 0) {
			return head;
		}

		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> tail = head;
		int length = 1;
		while (tail.next != null) {
			length++;
			tail = tail.next;
		}

		int i = 0;
		while (i < length - n - 1) {
			i++;
			temp = temp.next;
		}

		LinkedListNode<Integer> newHead = temp.next;
		temp.next = null;

		tail.next = head;

		return newHead;

	}

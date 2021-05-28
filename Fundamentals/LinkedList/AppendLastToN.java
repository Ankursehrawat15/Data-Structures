	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		if (head == null || n == 0) {
			return head;
		}

		LinkedListNode<Integer> temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}

		temp = head;
		int i = 0;
		while (i < length - n - 1) {
			i++;
			temp = temp.next;
		}

		LinkedListNode<Integer> newHead = temp.next;
		temp.next = null;

		temp = newHead;
		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = head;

		return newHead;

	}

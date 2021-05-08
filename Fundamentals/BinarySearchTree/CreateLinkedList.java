// 1st approach 

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

		if (root == null) {
			LinkedListNode<Integer> head = new LinkedListNode<>(null);
			return head;

		}
		LinkedListNode<Integer> mid = new LinkedListNode<>(root.data);

		LinkedListNode<Integer> leftHead = constructLinkedList(root.left);

		if (leftHead != null) {
			LinkedListNode<Integer> temp = leftHead;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = mid;

		} else {

			leftHead = mid;
			mid.next = constructLinkedList(root.right);

		}
		return leftHead;

	}

// 2nd approach

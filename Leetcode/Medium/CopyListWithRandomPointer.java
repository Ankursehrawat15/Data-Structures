// Using HashMaps TC- O(n) SC- O(N)
	public Node copyRandomList(Node head) {
		if (head == null)
			return head;
		HashMap<Node, Node> map = new HashMap<>();
		Node curr = head;
		while (curr != null) {

			map.put(curr, new Node(curr.val));
			curr = curr.next;
		}

		curr = head;
		while (curr != null) {
			map.get(curr).next = map.get(curr.next);
			map.get(curr).random = map.get(curr.random);

			curr = curr.next;
		}

		return map.get(head);

	}

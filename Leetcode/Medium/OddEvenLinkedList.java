Link : https://leetcode.com/problems/odd-even-linked-list/submissions/

// Approach 1 TimeComplexity O(N) , SpaceComplexity O(N)
	public ListNode oddEvenList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode oddHead = null;
		ListNode tail = null;
		int i = 1;
		ListNode temp = head;
		// for odd nodes
		while (temp != null) {
			if (i % 2 != 0) {
				ListNode node = new ListNode(temp.val);
				if (oddHead == null) {
					oddHead = node;
					tail = node;
				} else {

					tail.next = node;
					tail = tail.next;

				}
			}

			i++;
			temp = temp.next;
		}

		// for Even Nodes
		temp = head;
		ListNode evenHead = null;
		ListNode evenTail = null;
		i = 1;
		while (temp != null) {
			if (i % 2 == 0) {
				ListNode node = new ListNode(temp.val);
				if (evenHead == null) {
					evenHead = node;
					evenTail = node;
				} else {

					evenTail.next = node;
					evenTail = evenTail.next;

				}
			}

			i++;
			temp = temp.next;
		}

		tail.next = evenHead;
		evenTail.next = null;

		return oddHead;

	}

// Approach2 

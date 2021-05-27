/**
 * Definition for singly-linked list. 
 * public class ListNode { int val; 
 * ListNode next;
 *  ListNode() {} ;
 *  ListNode(int val) { this.val = val; } ListNode(int val,ListNode next) {
 *   this.val = val; this.next = next;
 *    }
 *     }
 */
// approach 2 ---> Time Complexity O(n)
// Two pointers Approach 
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode unique = head;
		ListNode checker = head.next;

		while (checker != null) {

			if (unique.val != checker.val) {

				unique.next = checker;
				unique = unique.next;

			}

			checker = checker.next;

		}

		unique.next = null;
		return head;

	}
}


// Approach 1 --> Time Compelxity O(N^2)
class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode newHead = new ListNode();
		newHead.val = head.val;
		ListNode tail = newHead;
		ListNode temp1 = newHead;
		ListNode temp = head;

		while (temp != null) {

			int count = 0;
			while (temp1 != null) {

				if (temp1.val == temp.val) {
					count++;
					break;
				}
				temp1 = temp1.next;
			}

			if (count == 0) {
				ListNode newNode = new ListNode();
				newNode.val = temp.val;
				newNode.next = null;
				tail.next = newNode;
				tail = tail.next;
			}

			temp = temp.next;
			temp1 = newHead;

		}

		return newHead;

	}
}

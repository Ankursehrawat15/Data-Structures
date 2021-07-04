  public static void unfold(ListNode head) {

        ListNode head1 = head;
        ListNode head2 = head.next;
        ListNode prev1 = head1;
        ListNode prev2 = head2;

        while (prev2 != null && prev2.next != null) {
            ListNode temp = prev2.next;
            prev1.next = temp;
            prev2.next = temp.next;
            prev1 = prev1.next;
            prev2 = prev2.next;
        }
        prev1.next = null;

        head2 = reverse(head2);

        prev1.next = head2;

    }

 public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }

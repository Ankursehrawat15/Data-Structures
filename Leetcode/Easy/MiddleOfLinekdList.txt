 public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        int mid = length / 2;
        ListNode midNode = head;
        int i =0;
        while(i < mid ){
            i++;
            midNode = midNode.next;
            
        }
        
        return midNode;
    }
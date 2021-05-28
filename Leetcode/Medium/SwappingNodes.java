// brute force approach
		class Solution {
		    public ListNode swapNodes(ListNode head, int k) {
		        ArrayList<Integer> list = new ArrayList<>();
		        ListNode node = head;
		        
		        while(node != null){
		            
		            list.add(node.val);
		            node = node.next;
		        }
		        
		        int temp = list.get(k-1);
		        list.set(k-1,list.get(list.size()-k));
		        list.set(list.size()-k,temp);
		        
		        ListNode newHead = new ListNode(list.get(0));
		        ListNode tail = newHead;
		        
		        for(int i = 1;i<list.size();i++){
		            
		            ListNode newNode = new ListNode(list.get(i));
		            tail.next = newNode;
		            tail = tail.next;
		            
		            
		        }
		        
		        tail.next = null;
		        return newHead;
		        
		        
		        
		        
		        
		    }
		}

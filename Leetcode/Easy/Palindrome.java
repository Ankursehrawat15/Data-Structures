// Approach 1 --> Time complexity O(N) and space Complexity O(N)
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            
            list.add(temp.val);
            temp = temp.next;
            
        }
        
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            
            if(list.get(start) != list.get(end)){
                return false;
            }
            
            start++;
            end--;
            
        }
        
        return true;
            
            
        
    }
}


// Another Approach  O(N) O(1)
class Solution {
    
	   ListNode reverse(ListNode head){
	      ListNode curr = head;
	      ListNode prev = null;
	      ListNode frwd = null;
	       
	       while(curr != null){
	           
	           frwd = curr.next;
	           curr.next = prev;
	           prev = curr;
	           curr = frwd;
	       }
	       
	       
	       return prev;
	       
	   }
	    
	    public boolean isPalindrome(ListNode head) {
	      
	        int length = 0;
	        ListNode temp = head;
	        while(temp != null){
	            length++;
	            temp = temp.next;
	        }
	        
	        int mid = length/2;
	        temp = head;
	        int i =1;
	        while(i < mid){
	            temp = temp.next;
	            i++;
	        }
	        ListNode midNode = temp.next;
	       
	        temp.next = null;
	        
	        
	         ListNode head2 = reverse(midNode);
	        
	        ListNode list1 = head;
	        ListNode list2 = head2;
	        while(list1 != null  && list2 != null){
	            
	            if(list1.val != list2.val){
	                return false;
	            }
	            
	            list1 = list1.next;
	            list2 = list2.next;
	        }
	        
	        
	        return true;
	            
	            
	        
	    }
	}

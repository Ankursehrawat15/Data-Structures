
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            
            list.add(temp.data);
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

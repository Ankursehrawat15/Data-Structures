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


// Another Approach 


// Time Complexity is O(N^2) and space O(1)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
    
        
        for(String s : words){
              
             boolean ans = true;      
            for(int i =0;i<s.length();i++){
                
                if(!allowed.contains(String.valueOf(s.charAt(i)))){
                    
                    ans = false;
                    break;
                }
                
            }
            
            if(ans) count++;
        }
        
        return count;
        
        
    }
}

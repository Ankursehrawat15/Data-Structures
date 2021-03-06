// using Stacks
// Time Complexity O(N) space as well
 public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                
                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                }
            }
        }
        
        count += stack.size();
        
        return count;
    }

// Two Pointers approach
// space O(1) and time O(N)
  public int minAddToMakeValid(String s) {
        
        int open =0 , close = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
            }else if (open > 0){
                open--;
            }else{
                close++;
            }
        }
        
        return open + close;
        
  }

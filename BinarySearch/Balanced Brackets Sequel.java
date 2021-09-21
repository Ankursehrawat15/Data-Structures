import java.util.*;

class Solution {
    public boolean solve(String s) {

    if(s.length() == 0) return true;

      Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
             
             if(s.charAt(i) == '('){
                  stack.push('(');
             }else if (s.charAt(i) == ')'){
                    if(stack.size()!= 0 && stack.peek()== '('){
                            stack.pop();
                    }else{
                            return false;
                    }
             }else if(s.charAt(i) == '{'){
                   stack.push('{');
             }else if(s.charAt(i) == '}'){
                    if(stack.size()!= 0 && stack.peek()== '{'){
                            stack.pop();
                    }else{
                            return false;
                    }
             }else if(s.charAt(i) == '['){
                   stack.push('[');
             }else{
                     if(stack.size()!= 0 && stack.peek()== '['){
                            stack.pop();
                    }else{
                            return false;
                    }
             }

        }

        return stack.size() == 0;
    }
}

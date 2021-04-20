public static boolean isBalanced(String str) {
        
        Stack<Character> stack = new Stack<>();
        
    for(int i=0;i<str.length();i++){
        if(str.charAt(i) == '('){
            stack.push(str.charAt(i));
            
        }else if(str.charAt(i) == ')'){
            if(stack.isEmpty()){
                return false;
            }
            else{
                char topchar = stack.pop();
        
        if(str.charAt(i) == ')' && topchar == '('){
            continue;
        }else{
            return false;
        }
            }
        }
        
     }
        return stack.isEmpty();
    }

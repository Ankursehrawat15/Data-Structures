public static boolean checkRedundantBrackets(String str) {
		Stack<Character> stack = new Stack<>();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ')'){
                if(stack.peek() == '('){
                    return true;
                }else{
                    int count =0;
                    while(stack.peek() != '('){
                        stack.pop();
                        count++;
                    }
                    stack.pop();
                    if(count < 2){
                        return true;
                    }
                    
                }
                
        }else{
                stack.push(str.charAt(i));
            }
            
        }
        
        return false;
	}

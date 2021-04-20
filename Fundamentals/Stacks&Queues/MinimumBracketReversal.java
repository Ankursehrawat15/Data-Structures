public static int countBracketReversals(String str) {

          if (str.length() % 2 != 0) return -1;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == '}' && stack.isEmpty()){
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }

            }

        }
        int count = 0;
        while (!stack.isEmpty()) {
            char c1 = stack.pop();
            char c2 = stack.pop();

            if (c1 == c2) {
                count++;
            }else if(c1 != c2){
                count += 2;
            }
        }


        return count;
        
}

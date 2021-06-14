
public class Solution {

	public static int[] stockSpan(int[] price) {
		Stack<Integer> stack = new Stack<>();
        int [] ans = new int[price.length];
        ans[0] = 1;
        stack.push(0);
        for(int i=1;i<price.length;i++){
            while(stack.size()>0 && price[i] > price[stack.peek()]){
                stack.pop();
            }
            
            if(stack.size() == 0){
                ans[i] = i+1;
            }else{
                ans[i] = i - stack.peek();
            }
            
            stack.push(i);
        }
        
        
        return ans;
	}

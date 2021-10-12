// time complexity is O(n + m)
// space is O(N) using String Builder

class Solution {
    public String addStrings(String num1, String num2) {
             
		if(num1.length() == 0 || num2.length() == 0 ) return num1.length() ==0 ? num2 : num1;
		StringBuilder sb = new StringBuilder();
		
		int i = num1.length()-1;
		int j = num2.length()-1;
		int carry = 0;
		while(j >= 0 && i >= 0) {
			
			int num_1 = num1.charAt(i) - '0';
			int num_2 = num2.charAt(j) - '0';
			
			int sum = num_1 + num_2 + carry;
			  carry = sum / 10;
			  sb.append(sum % 10);
		    
			  i--;
			  j--;
		}
		
		if(j >= 0) {
		   while(j >= 0) {
		       int n = num2.charAt(j) - '0';
		       int sum = n + carry;
		       carry = sum / 10;
		       sb.append(sum % 10);
		       j--;
		   }
		}
		
		if(i >= 0) {
			   while(i >= 0) {
			       int n = num1.charAt(i) - '0';
			       int sum = n + carry;
			       carry = sum / 10;
			       sb.append(sum % 10);
			       i--;
			   }
			}
        
        if(carry != 0) {
			sb.append(carry);
		}
		
		return sb.reverse().toString();
		
		
    }
}

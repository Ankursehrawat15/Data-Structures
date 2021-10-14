class Solution {
  // time complexity is O(N) 
    public int reverse(int x) {
		int upperLimit = (int) (Math.pow(2, 31) - 1);
		int lowerLimit = (int) Math.pow(-2 ,  31);
		System.out.println(upperLimit);
		long digit = 0;
		while(x != 0) {
			
			
			int num = x % 10;
			digit = digit * 10 + num;
			if(digit > upperLimit || digit < lowerLimit) {
				return 0;
			}
			
	        x = x / 10;		
			
			
		}
		
		return (int) digit;
        
        
        
    }
}

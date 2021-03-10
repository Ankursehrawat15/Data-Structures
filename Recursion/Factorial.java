public class Factorial {
	
	
	public static int factorial(int n) {
		
		if(n ==0) {
			return 1;
		}
		
		int divideProb = factorial(n-1);   // function calling itself
		return n* divideProb;
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int factorial = factorial(num);
		System.out.println(factorial);
		
		

	}

}

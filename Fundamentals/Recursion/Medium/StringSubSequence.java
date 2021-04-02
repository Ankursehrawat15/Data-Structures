
	public static String[] findSubsequences(String str) {
		
		// yz => recursion " "  y z yz * x
		// we have to work for x
		
		if(str.length() == 0) {
			String [] arr = {" "};
			return arr;
		}
		
		String [] smallAns = findSubsequences(str.substring(1)); // yz
			
		
		String [] ans = new String[2 * smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			
			ans[k] = smallAns[i];
			k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			
			ans[k] = str.charAt(0) + smallAns[i];
			k++;
		}
		
		return ans;
		}
	
		public static void main(String[] args) {
		
		String str = "xyz";
		//  x y z xy yz xz xyz
		
		String [] ans = findSubsequences(str);
		
		for(int i =0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		}
	}

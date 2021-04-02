public static void main(String []args) {
		int [] arr = {3, 6, 4, 8, 7};
		
		
	
		for(int i =0;i<arr.length;i++) {
			int product =1;
			
			for(int j=0;j<arr.length;j++) {
				
				if(j == i) {
				continue;
					
				}else {
					product = product * arr[j];
				}
				
			}
			
			
				System.out.println(product);
			
	
		}
		

	}
		

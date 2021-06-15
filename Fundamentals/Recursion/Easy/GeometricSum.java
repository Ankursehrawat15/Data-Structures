public static double findGeometricSum(int k){
		if(k == 0){
            return 1;
        }
        
        double smallAns = findGeometricSum(k-1);
        return 1/Math.pow(2,k)+ smallAns;
        
     
	}

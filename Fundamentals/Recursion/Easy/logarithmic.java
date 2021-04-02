    public static int power(int x, int n){
        if(n == 0){
        
        return 1;    
        
            
        }
        
        int smallAns = power(x , n/2);
        int xn = smallAns * smallAns;
        
        if(n % 2 == 1){
            
            xn = xn * x;
        }
        
        return xn;
        
    }

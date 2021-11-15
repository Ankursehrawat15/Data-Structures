// Time complexity is O(Logn )
class Solution {
    
    double binaryExpo(double x , int n ){
        if(n == 1) return x;
        if(n == 0) return 1;
        
        double ans = binaryExpo(x , n/2);
        if(n % 2 != 0){
            ans = ans * ans * x;
            
        }else{
            
            ans = ans * ans;
                
            
        }
        
        return ans;
    }
    
    
    public double myPow(double x, int n) {
         if(n == 0) return 1;
       
         if(n < 0) {
             x = 1 / x;
             n = -1 * n;
         }
        return binaryExpo(x , n);
    }
}

// using DP Memorization
 private int dp_fib(int n , int[] str){
            
            if(n == 1 || n == 0){
                    str[n] = n;
                    return str[n];
            }
            
            
            if(str[n] != -1){
                    return str[n];
            }
            
            str[n] = dp_fib(n-1 , str) + dp_fib(n-2 , str);
            return str[n];
    }
        
        
        
    public int fib(int n) {
        
     int [] arr = new int[n+1];
            Arrays.fill(arr , -1);
         
            return dp_fib(n , arr);
         
    }




public class FibonnaciNumber {
    // time complexity is very bad as we are doing repetitve work
    // will optimize this after doing DP
    public int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int ans = fib(n - 2) + fib(n - 1);

        return ans;

    }
}

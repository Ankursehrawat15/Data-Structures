import java.util.*;

class Solution {
    public int solve(String s) {
        if(s.length() == 0 ) return 0;
        int ans = 0;
        char prev = s.charAt(0);
        int count = 1;
     for(int i =1;i<s.length();i++){

         if(s.charAt(i) == prev){
                 count++;
         }else{
                 prev = s.charAt(i);
                 count = 1;
         }

         if(count == 3){
             ans++;
             count = 0;
         }


     }  

  return ans;


    }
}

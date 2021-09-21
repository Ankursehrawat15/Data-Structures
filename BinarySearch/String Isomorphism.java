import java.util.*;

class Solution {
    public boolean solve(String s, String t) {
       if(s.length() != t.length()) return false;
 
   HashMap<Character,Character> map = new HashMap<>();
   HashSet<Character> set  = new HashSet<>();

   for(int i =0;i<s.length();i++){

     
     if(map.containsKey(s.charAt(i))){

            char val = map.get(s.charAt(i));
            if(val != t.charAt(i)){
                    return false;
            } 

     }else{

        if(set.contains(t.charAt(i))){
                return false;
        }else{
                map.put(s.charAt(i) , t.charAt(i));
                set.add(t.charAt(i));
        }
     }

   }

   return true;

    }
}

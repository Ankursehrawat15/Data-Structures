

public static int countZerosRec(int input){
        
   if(input < 10){
       if(input == 0){
           return 1;
       }
       return 0;
   }
        int smallAns = countZerosRec(input/10);
        int count = 0;
        if((input%10) == 0 ){
            count++;
            return count + smallAns;
            
            
        }else{
            return smallAns;
        }
   
    }

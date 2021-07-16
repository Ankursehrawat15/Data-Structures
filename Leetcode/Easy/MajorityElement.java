// TimeComplexity O(N^2) 
// SpaceComplexity O(1)
public int majorityElement(int[] arr){
      
    int maxCount = 0;
    int value = Integer.MIN_VALUE;
    
for(int i =0;i<arr.length;i++){
     int count = 0;
     
     for(int j =i;j<arr.length;j++){
             if(arr[j] == arr[i]){
                     count++;
             }
     }
     
     if(count > maxCount){
             maxCount = count;
             value = arr[i];
     }
}
    
int max = arr.length / 2;
    if(maxCount > max){
            return value;
    }else{
            return -1;
    }
    
}


// TimeComplexity is 0(N)
// SpaceComplexity is 0(N) because of hashMaps

public int majorityElement(int[] arr){
      
    HashMap<Integer , Integer> map = new HashMap<>();
    
       for(int i =0;i<arr.length;i++){
               if(map.containsKey(arr[i])){
                       
                      int count = map.get(arr[i]);
                       map.put(arr[i] , ++count);
               }else{
                       map.put(arr[i] , 1);
               }
       }
       
       
       int maxCount = 0;
       int value = 0;
       
       for(Map.Entry<Integer , Integer> entry : map.entrySet()){
               
               if(entry.getValue() > maxCount){
                       maxCount = entry.getValue();
                       value = entry.getKey();
               }
       }
       
       
       if(maxCount > (arr.length / 2)) return value;
        
       return -1;
}



// TimeComplexity O(N)
// spaceComplexity O(1)
public int majorityElement(int[] arr){
     
    int count = 1 , value = arr[0];
for(int i=1;i<arr.length;i++){
     
     if(arr[i] == value){
             count++;
     }else{
             count--;
     }
     
     if(count == 0){
             count = 1;
             value = arr[i];
     }
    
}
    
    return value;
    
    
    
    
}
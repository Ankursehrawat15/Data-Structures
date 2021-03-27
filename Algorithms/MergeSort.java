

public static void sort(int [] arr){
 
  if(arr.length <= 1){
  return;
  }
  
  int mid = arr.length / 2;
  int [] leftArr = new int [mid];
  int [] rightArr = new int [arr.length - mid];
  
  for(int i =0; i<mid; i++){
   
    leftArr[i] = arr[i];
     
  }
  
  int k =0;
  for(int i = mid; i < arr.length; i++){
    
    rigthArr[k] = arr[i];
    k++;
  }
  
  sort(leftArr);
  sort(rigthArr);
  merge(leftArr , rigthArr , arr);
  
  
  
}

public static void merge(int [] left , int rigth[] , int output){
  
  int i =0 , j = 0 , k = 0 ;
 while(i<left.length && j<rigth.length){
 
   
   if(left[i] < rigth[j]){
    output[k] = left[i];
     i++;
     k++;
   
   }else{
          output[k] = right[j];
     j++;
     k++;
   }
 
 
 }
  
  while(i<left.length){
    output[k] = left[i];
    k++;
    i++;
  }
   while(j<right.length){
    output[k] = right[j];
    k++;
    j++;
  }
  
}

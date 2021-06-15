class Main {

  // check array is Sorted
  public static boolean checkSorted(int [] arr){
      
      if(arr.length <= 1){
        return true;
      }
    int [] smallArr = new int[arr.length-1];
    for(int i =1;i<arr.length;i++){
      smallArr[i-1] = arr[i];
    }

    boolean ans = checkSorted(smallArr);
    if(ans != true ){
      return false;
    }

    if(arr[0] <= smallArr[0]){
      return true;
    }else{
      return false;
    }
  }
  
  
  // Better way
   public static boolean checkSorted(int [] arr , int index){
        if(index == arr.length-1){
        return true;
      }

      if(arr[index] > arr[index+1]){
        return false;
      }

      boolean isSorted = checkSorted(arr,index+1);
      return isSorted;
      
  }


  public static void main(String[] args) {
    int [] arr = {1};
    boolean  ans = checkSorted(arr);
    System.out.println(ans);
  }
}

// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.

// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.


 public int firstNonRepeating(int arr[], int n) 
    { 
        for(int i=0;i<arr.length;i++){
            int count =0;
            
            for(int j=0;j<arr.length;j++){
                
                if(i==j){
                    continue;
                }
                
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
              
              }
              
              if(count==0){
                  return arr[i];
              }
            
            
        }
        return 0;
     
    }  

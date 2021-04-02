

// Given an array Arr of size N, print second largest element from an array.

// Example 1:

// Input: 
// N = 6
// Arr[] = {12, 35, 1, 10, 34, 1}
// Output: 34
// Explanation: The largest element of the 
// array is 35 and the second largest element
// is 34.

 int print2largest(int arr[], int n) {
        // code here
        
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
         
         if(arr[i] > max){
             max = arr[i];
         }
    }
    
    int secondmax = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        
        if(arr[i] > secondmax){
            
            if(arr[i] < max){
                secondmax = arr[i];
            }
            
        }
        
        
    }
    
    
    if(secondmax == Integer.MIN_VALUE){
        return -1;
    }
    return secondmax;
     
     
    }
















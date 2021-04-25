//  Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. 
// In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).


// Input:
// n = 5
// arr[] = {1,2,3,4,5}
// Output: 2 1 4 3 5
// Explanation: Array elements after 
// sorting it in wave form are 
// 2 1 4 3 5.


public static void convertToWave(int arr[], int n){
        
        // Your code here
        for(int i=0;i<arr.length-1;i+=2){
             
             if(arr[i+1] > arr[i]){
                 int temp =arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
             }            
        }
        
    }

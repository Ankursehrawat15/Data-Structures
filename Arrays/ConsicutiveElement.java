// Problem Statement
// You are given an array arr of N non-negative integers, you need to return true if the array elements consist of consecutive numbers otherwise return false.
// For Example: If the given array is [4,3,5] then you should return true as all the array elements are in consecutive order.
// Sample Input 1:
// 1
// 4
// 1 2 4 6
// Sample Output 1:
// False




public static boolean isConsecutive(int[] arr, int n) {
		//Write your code here
              Arrays.sort(arr);
        int count =0;
               
        for(int i=0; i<arr.length-1;i++){
            
            if(arr[i+1] - arr[i] != 1){
               return false;
            }
          
           }
        return true;
            
            
            
        }


// Problem Statement
// Given an array of length N, which contains single digit elements at every index. You need to find and return the sum of all elements of the array. But the final sum should also be a single digit.
// In order to keep the output single digit - you need to keep adding the output number digits till single digit is left.

// 3
// 9 9 9
// Sample Output 1 :
// 9




	public static int sum(int arr[])
	{
        int sumArr = 0;
        int sum = 0;
      for(int i=0;i<arr.length;i++){
          
          sumArr += arr[i];
          
      }
       
        
        while (sumArr!=0){
            int lastdigit = sumArr % 10;
            sumArr /= 10;
            sum += lastdigit;
            
        }
        return sum;
	}

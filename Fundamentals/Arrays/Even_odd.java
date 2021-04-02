// Given an array arr[] of size N containing equal number of odd and even numbers. \
// Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
// Note: There are multiple possible solutions, Print any one of them. Also, 0-based indexing is considered.


// Input:
// N = 6
// arr[] = {3, 6, 12, 1, 5, 8}
// Output:
// 1
// Explanation:
// 6 3 12 1 8 5 is a possible solution.
// The output will always be 1 if your
// rearrangement is correct.





static void reArrange(int[] arr, int N) {
        // code here
        int [] even =new int [N/2];
        int [] odd = new int [N/2];
        int j =0;
        int k=0;
        
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
            even[j] =arr[i];
            j++;
            }else{
                odd[k] = arr[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                arr[i] = even[j];
            j++;
            }else{
                arr[i] = odd[k];
                k++;
            }
        }
    }

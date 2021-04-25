// Ishaan is given N integers in the form of an array A. He is asked to select all of these integers in any order. For selecting every integer he gets some points. He needs to maximize those points.
// For every integer he selects, he gets points equal to the value of :
// the selected integer * number of integers selected before the current integer (Refer example for explanation)
// Help him find the maximum points he can get provided he can select every integer exactly 1 time.


 public static long selection (int arr[], int n) {
        //Complete the function
        long points = 0;
        int selectedBefore = 0;
        
       Arrays.sort(arr);   
     
     
        for(int i =0;i<n;i++){
            
            points = points + (arr[i] * selectedBefore);
            selectedBefore++;
            
            
            
            
        }
         return points;
    }
   

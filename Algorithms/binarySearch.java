// iterative
public static int binarySearch(int[] arr, int x) {
        
        int start = 0;
        int end = arr.length - 1;
        
      
        
        while(start <= end){
              int mid = (start + end)/2;
            if(arr[mid] == x){
                return mid;
            }else if (arr[mid] < x){
                start = mid +1;
            }else{
                end = mid -1;
            }
            
            
        }
        
        return -1;
       
        
    
    }
// recursively 
public static int binarySearch(int[] arr, int x, int start, int end) {

		if (start <= end) {

			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
                 
				return binarySearch(arr,x,mid+1,end);
                       
			} else {
				return binarySearch(arr,x,start,mid-1);
			}
		}

	       return -1;

	}

	public static int binarySearch(int[] arr, int x) {

		int start = 0;
		int end = arr.length - 1;
		return binarySearch(arr, x, start, end);

	}

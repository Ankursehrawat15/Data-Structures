// Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
// Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
// You should start traversing your array from 0, not from (N - 1).
// Do this recursively. Indexing in the array starts from 0.




public static int lastIndex(int input[], int x , int index) {
		
        
        if(index < 0 ) return -1;
        
        if(input[index] == x  ){
            return index;
        }
        
        int smallAns = lastIndex(input , x , index-1);
        
        return smallAns;
  }

	public static int lastIndex(int input[], int x) {
        
        int index = input.length-1;
        return lastIndex(input , x , index );
		
	}

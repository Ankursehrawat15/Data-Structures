// leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// time complexty O(N) and space Complexity is O(1)
public int removeDuplicates(int[] arr) {
      
        
    int j = 0;
        
        
     for(int i =1;i<arr.length;i++){
             
          if(arr[i] != arr[j])
          {
                  arr[++j] = arr[i];
          }  
     }
        
        return ++j;
    
    
}
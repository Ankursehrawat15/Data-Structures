 public static void sort012(int a[], int n)
    {
        // time complexity is O(2N) and Space Complexity is O(1)
        int count0 = 0 , count1 = 0 , count2 = 0;
        
        for(int num : a){
            if(num == 0){
                count0++;
            }else if(num == 1){
                count1++;
            }else{
                count2++;
            }
        }
        
        for(int i =0;i<n;i++){
            
            if(count0  > 0){
                a[i] = 0;
                count0--;
            }else if(count1 > 0){
                a[i] = 1;
                count1--;
            }else if( count2 > 0){
                a[i] = 2;
                count2--;
            }
            
        }
        
    }

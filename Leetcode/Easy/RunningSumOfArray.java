// o(n) 
// Second Approach
int [] arr = new int[nums.length];
        int prevSum = 0;
        int sum =0;
        for(int i =0;i<arr.length;i++){
        
            sum = prevSum + nums[i];
            prevSum = sum;
            arr[i] = prevSum;
        }
        
        return arr;
    }

// first Approach.
 int [] arr = new int[nums.length];
        for(int i =0;i<arr.length;i++){
            int sum =0;
            for(int j =0;j<= i;j++){
                sum += nums[j];

            }
                            arr[i] = sum;
        }
        
        return arr;

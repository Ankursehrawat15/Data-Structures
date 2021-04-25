// 0(n) 
public int[] shuffle(int[] nums, int n) {
        
     int [] arr = new int[nums.length];
     int otherHalf = (nums.length / 2);
        int firstHalf = 0;
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(i == 0 || i % 2 == 0){
                arr[j] = nums[firstHalf];
                firstHalf++;
            }else{
                arr[j] = nums[otherHalf];
                otherHalf++;
            }
            j++;
        }
        
        return arr;
        
    }

// Time complexity O(2N) and space Complexity is O(N) 
public List<Integer> majorityElement(int[] nums) {
            int n = nums.length;
           Map<Integer , Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                    if(map.containsKey(num)){
                            int k = map.get(num);
                            map.put(num , ++k);
                    }else{
                            map.put(num , 1);
                    }
            }
            
            int val = 0;
            for(Map.Entry<Integer , Integer> entry : map.entrySet()){
                    
                    val = entry.getValue();
                    if(val > (n/3) ){
                         list.add(entry.getKey());
                    }
                    
            }
            
            return list;
          
    }
// Time Complexity is O(2N) and Space Complexity is O(1)
// Moore's Voting Algorithm
  public List<Integer> majorityElement(int[] nums) {
         List<Integer> list = new ArrayList<>();
            int n = nums.length;
            int num1 =Integer.MIN_VALUE,num2 = Integer.MIN_VALUE , count1 = 0 , count2 = 0;
           
            for(int num : nums){
                    if(num1 == num){
                            count1++;
                    }else if(num2 == num){
                            count2++;
                    }else if(count1 == 0){
                            num1 = num;
                            count1 = 1;
                    }else if(count2 == 0){
                            num2 = num;
                            count2 = 1;
                    }else{
                            count1--;
                            count2--;
                    }
            }
            
            int cnt1 = 0 , cnt2 = 0;
            for(int num : nums){
                   if(num1 == num){
                           cnt1++;
                   } 
                    
                    if(num2 == num){
                            cnt2++;
                    }
            }
            
            if(cnt1 > n/3){
                    list.add(num1);
            }
            
            if(cnt2 > n/3){
                    list.add(num2);
            }
            
            
            return list;
    }

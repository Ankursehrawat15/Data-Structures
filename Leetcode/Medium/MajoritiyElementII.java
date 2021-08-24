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

// Using HashMaps
// Time complexity is O(N) and Space Complexity is O(N)
class Solution {
    public int majorityElement(int[] nums) {
            int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
            
            for(int i=0;i<nums.length;i++){
                    
                 map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);        
            }
            
           
            int key = -1;
            for(Map.Entry mapElem : map.entrySet()){
                    
                    if((int)mapElem.getValue() > (n/2 ) ){
                          
                        key = (int) mapElem.getKey();
                    }
            }
            
            
            return key;
            
            
    }
}


// Time complexity is O(N) and Space Complexity is O(1)
 public int majorityElement(int[] nums) {
        // Moore's Voting Algorithm
            int iteration = 1;
            int elem = nums[0];
            for(int i =1;i<nums.length;i++)
            {
                if(nums[i] == elem){
                        iteration++;
                }else{
                        if(iteration == 0){
                            
                           elem = nums[i];
                           iteration = 1;
                        }else{
                                iteration--;
                        }
                }    
            }
            
            return elem;
            
    }

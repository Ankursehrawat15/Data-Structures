	public static int maxFrequencyNumber(int[] arr) {
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}

			if (count > max) {
				max = count;
				num = arr[i];
			}
		}

		return num;

	}

// Using HashMaps
 public static int maxFrequencyNumber(int[] arr){ 
		 
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i =0;i<arr.length;i++){
	            
	            if(map.containsKey(arr[i])){
	                
	                int v = map.get(arr[i]);
	                v++;
	                map.put(arr[i] , v);
	                
	            }else{
	            
	            
	            map.put(arr[i], 1);
	            }
	            
	        }
	        
	        int max = Integer.MIN_VALUE;
	        int ans = 0;
	     for(int i: arr){
	         if(map.get(i) > max){
	             max = map.get(i);
	             ans = i;
	         }
	         
	     }
	        
	        
	        return ans;
	        
	    }
	}

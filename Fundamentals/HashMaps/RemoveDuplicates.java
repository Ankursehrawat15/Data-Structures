	public static String uniqueChar(String str){
	 
         HashMap<Character,Boolean> map = new HashMap<>();
        String ans = "";
        
        for(int i =0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }
              map.put(str.charAt(i) , true);
            ans += str.charAt(i);
        }
        
        return ans;

	}

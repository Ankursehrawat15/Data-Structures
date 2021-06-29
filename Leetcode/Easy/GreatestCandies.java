  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<>(); 
        int maxCandies = Integer.MIN_VALUE;
        
        for(int candy : candies){
         if(candy > maxCandies){
              maxCandies = candy;
            }
        }
        
        for(int candy : candies){
            if(candy + extraCandies >= maxCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }
      
        return list;
        
        
    }

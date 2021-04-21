public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = Integer.MIN_VALUE;
        for(int i =0; i<candies.length;i++){
            if(candies[i] > highest){
                highest = candies[i];
            }
        }
        List<Boolean> isHighest = new ArrayList<Boolean>(); 
        for(int i =0; i<candies.length;i++){
            if(candies[i] + extraCandies >= highest){
                isHighest.add(true);
                
            }else{
                isHighest.add(false);
            }
        }
        
        return isHighest;
        
    }

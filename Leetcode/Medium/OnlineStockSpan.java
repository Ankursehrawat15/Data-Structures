// Time complexity O(N^2)
class StockSpanner {
   
    ArrayList<Integer> stocks;
    
    public StockSpanner() {
        
        stocks = new ArrayList<>();
    }
    
    public int next(int price) {
      
        stocks.add(price);
        
        for(int i = stocks.size()-1;i>=0;i--){
            int j = i-1;
            while(j >= 0 && stocks.get(j) <= stocks.get(i)){
                j--;
            }
            
            return i-j;
        }
        
        
        return -1;
        
    }
}

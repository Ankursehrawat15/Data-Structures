// https://leetcode.com/problems/design-hashset/
class MyHashSet {
 ArrayList<MapNode> bucket;
        int size;
        int numBucket;
        private final double loadFactor = 0.7;
    /** Initialize your data structure here. */
    public MyHashSet() {
        this. numBucket  = 20;
            this.bucket = new ArrayList<>();
            for(int i =0;i<numBucket;i++){
                    bucket.add(null);
            }
            this.size = 0;
    }
        
        private void rehash(){
                ArrayList<MapNode> temp = bucket;
                bucket = new ArrayList<>();
                numBucket = 2*numBucket;
                for(int i =0;i<numBucket;i++){
                        bucket.add(null);
                }
                
                for(int i =0;i<temp.size();i++){
                        MapNode head = temp.get(i);
                        while(head != null){
                                
                             add(head.value);   
                                head = head.next;
                        }
                }
        }
        
        private int hash(int key){
                int code = Integer.hashCode(key);
                return code % numBucket;
        }
    
    public void add(int key) {
        int index = hash(key);
            MapNode head = bucket.get(index);
            while(head != null){
                if(head.value == key){
                        return;
                }
                    
                    head = head.next;
            }
            
            head = bucket.get(index);
            MapNode newNode = new MapNode(key);
            size++;
            newNode.next = head;
            bucket.set(index , newNode);
            
            double lf = (1.0*size)/numBucket;
            if(lf > loadFactor){
                    rehash();
            }
    }
    
    public void remove(int key) {
         int index = hash(key);
            MapNode head = bucket.get(index);
            MapNode prev = null;
            while(head != null){
                if(head.value == key){
                        if(prev == null){
                                bucket.set(index , head.next);
                        }else{
                                prev.next = head.next;
                        }
                        size--;
                        
                        return;
                }
                    prev = head;
                    head = head.next;
            }
            
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
         int index = hash(key);
            MapNode head = bucket.get(index);
            while(head != null){
                if(head.value == key){
                        return true;
                }
                    
                    head = head.next;
            }
            
            return false;
    }
}

class MapNode{
        int value;
        MapNode next;
        
        public MapNode(int value){
                this.value = value;
                this.next = null;
        }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

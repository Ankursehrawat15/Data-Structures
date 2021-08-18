// https://leetcode.com/problems/design-hashmap/
class MyHashMap {

        ArrayList<MapNode<Integer , Integer>> bucket;
        int size;
        int numBucket;
        final double loadFactor = 0.7;
    /** Initialize your data structure here. */
    public MyHashMap() {
            numBucket = 20;
            bucket = new ArrayList<>();
            for(int i =0;i<numBucket;i++){
                    bucket.add(null);
            }
            
            size =0;
        
    }
        
        private void rehashing(){
                
                ArrayList<MapNode<Integer , Integer>> temp = bucket;
                 bucket = new ArrayList<>();
                numBucket = 2*numBucket;
                for(int i =0;i<numBucket;i++){
                        bucket.add(null);
                 }
                
                for(int i =0;i<temp.size();i++){
                        MapNode<Integer , Integer> node = temp.get(i);
                        while(node != null){
                           put(node.key , node.value);
                                node = node.next;
                        }
                }
        }
        
        
        private int hashCode(int key){
                
             int hash = Integer.hashCode(key);
                
                return hash % numBucket;
                
        }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = hashCode(key);
            MapNode<Integer  , Integer> head = bucket.get(index);
            while(head != null){
                    
                    if(head.key.equals(key)){
                            head.value = value;
                            return;
                    }
                    
                    head = head.next;
            }
            
            head = bucket.get(index);
            MapNode<Integer , Integer> newNode = new MapNode<>(key , value);
            size++;
            newNode.next = head;
            bucket.set(index , newNode);
            
            double lf = (1.0 * size)/numBucket;
            if(lf > loadFactor){
                    
                    rehashing();
            }
            
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
         int index = hashCode(key);
            MapNode<Integer  , Integer> head = bucket.get(index);
            while(head != null){
                    
                    if(head.key.equals(key)){
                           return head.value;
                    }
                    
                    head = head.next;
            }
            
            return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
         int index = hashCode(key);
             MapNode<Integer  , Integer> head = bucket.get(index);
             MapNode<Integer  , Integer> prev = null;
            while(head != null){
                    
                    if(head.key.equals(key)){
                       
                            if(prev == null){
                                    bucket.set(index  , head.next);
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
}

class MapNode<K,V> {
        K key;
        V value;
        MapNode<K,V> next;
        
        public MapNode(K key , V value){
                this.key = key;
                this.value = value;
                next = null;
        }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

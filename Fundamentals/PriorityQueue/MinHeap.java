import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
        
        if(heap.size() == 0){
            throw new PriorityQueueException();
        }
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
        int parent = 0;
        int child1 = 1;
        int child2 = 2;
        int min = parent;
        
        
        while(child1 < heap.size()){
        if(heap.get(child1) < heap.get(parent)){
            min = child1;
        }
            
            
        if( child2 < heap.size()   && heap.get(child2) < heap.get(min)){
            min = child2;
        }
        
        if(min == parent ){
            break;
        }else{
            
            int temp1 = heap.get(min);
            heap.set(min , heap.get(parent) );
            heap.set(parent , temp1);
            
            parent = min;
            child1 = 2 * parent + 1;
            child2 = 2 * parent + 2;
            
            
        }
            
        }
        
        
        return temp;
        
        
     
    }
}

class PriorityQueueException extends Exception {

}

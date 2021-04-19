public class Queue {
	
   private Node front;
     private   Node rear;
     private   int size;


	public Queue() {
		front = null;
        rear = null;
        size =0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		return size;
    }


    public boolean isEmpty() { 
    	return size == 0;
    }


    public void enqueue(int data) {
    	Node newNode = new Node(data);
        if(size == 0){
            front = newNode;
            rear = newNode;
            size++;
        }else{
            rear.next = newNode;
            rear = rear.next;
            size++;
        }
    }


    public int dequeue() {
       if(getSize() == 0){
           return -1;
       }
        
        int temp = front.data;
        front = front.next;
	    if(size == 1){
		    rear = null;
	    }
        size--;
        return temp;
    	
    }


    public int front() {
        if(front == null){
           return -1;
        }
        return front.data;
    	
    }
}

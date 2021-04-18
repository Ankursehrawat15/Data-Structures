
	
	private void doublecapacity() {
		int [] temp = data;
		data = new int [2 * temp.length];
		int index = 0;
		for(int i = front; i < data.length; i++) {
			data[index] = temp[i];
	          index++;	
		}
		
		for(int i = 0; i <= front-1 ; i++) {
			
			data[index] = temp[i];
			index++;
		}
		
		front = 0;
		rear = temp.length - 1;
		
	}
	
	void enqueue(int elem) throws QueueFullException {
		if(size == data.length) {
			
			doublecapacity();
		}
		
		if(size() == 0) {
			front = 0;
		}
		
		rear++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = elem;
		size++;
	}
	

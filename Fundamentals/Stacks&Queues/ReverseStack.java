// In this approach i am using an Array
int arr[] = new int[input.size()];
	
	for(int i =0; i <arr.length;i++) {
		
		arr[i] = input.pop();
		
	}
	
	for(int i=arr.length-1;i>= 0;i--) {
		
		extra.push(arr[i]);
	}
	
	while(extra.size() != 0) {
		
		int temp = extra.pop();
		input.push(temp);
	}


// using Recursion
int arr[] = new int[input.size()];

	for (int i = 0; i < arr.length; i++) {

		arr[i] = input.pop();

	}

	for (int i = arr.length - 1; i >= 0; i--) {

		extra.push(arr[i]);
	}

	while (extra.size() != 0) {

		int temp = extra.pop();
		input.push(temp);
	}
	

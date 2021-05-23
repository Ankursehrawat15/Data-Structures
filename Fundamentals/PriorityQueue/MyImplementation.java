// Min priority Queue

package priorityQueue;

import java.util.ArrayList;

public class PriorityQueue {

	private ArrayList<Integer> heap;

	public PriorityQueue() {
		heap = new ArrayList<>();
	}

	// size of heap
	public int heapSize() {
		return heap.size();
	}

	// heap is empty
	public boolean isEmpty() {

		return heap.size() == 0;

	}

	// get minimum element in Minimum heap
	public int getMin() throws PriorityQueueException {
		if (heap.isEmpty()) {
			// Throws an Exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	// insert in minimum heap
	public void insert(int data) {

		heap.add(data);
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

}

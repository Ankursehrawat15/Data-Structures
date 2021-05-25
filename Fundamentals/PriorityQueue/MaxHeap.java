import java.util.ArrayList;

public class PQ {

	ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<>();

	}

	// Complete this class
	boolean isEmpty() {
		return heap.isEmpty();
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if (heap.size() == 0) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int child = heap.size() - 1;
		int parent = (child - 1) / 2;

		while (child > 0) {
			if (heap.get(child) > heap.get(parent)) {

				int temp = heap.get(child);
				heap.set(child, heap.get(parent));
				heap.set(parent, temp);

				child = parent;
				parent = (child - 1) / 2;

			} else {
				return;
			}

		}

	}

	int removeMax() {

		if (heap.size() == 0) {
			return Integer.MIN_VALUE;
		}

		int ans = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		int parent = 0;
		int child1 = 1;
		int child2 = 2;
		int max = parent;

		while (child1 < heap.size()) {

			if (heap.get(child1) > heap.get(parent)) {
				max = child1;
			}

			if (child2 < heap.size() && heap.get(child2) > heap.get(max)) {

				max = child2;

			}

			if (max == parent) {
				break;
			} else {

				int temp = heap.get(max);
				heap.set(max, heap.get(parent));
				heap.set(parent, temp);

				parent = max;
				child1 = 2 * parent + 1;
				child2 = 2 * parent + 2;

			}

		}

		return ans;

	}
}

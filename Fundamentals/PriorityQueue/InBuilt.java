package priorityQueue;

import java.util.PriorityQueue;

public class InBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int[] arr = { 4, 5, 3, 6, 2, 1 };
		for (int i = 0; i < arr.length; i++) {

			pq.add(arr[i]);

		}

		while (!pq.isEmpty()) {

			System.out.println(pq.remove() + " ");

		}

		System.out.println(pq.size());

	}

}

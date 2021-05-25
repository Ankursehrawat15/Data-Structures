// self implemented ===> code can be reduced
public class Solution {

	public static void heapify(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int child = i;
			int parent = (i - 1) / 2;

			while (child > 0) {

				if (arr[child] < arr[parent]) {

					int temp = arr[child];
					arr[child] = arr[parent];
					arr[parent] = temp;

					child = parent;
					parent = (child - 1) / 2;
				} else {

					break;
				}

			}

		}

	}

	static void sort(int[] arr) {
		int j = arr.length - 1;

		while (j > 0) {
			int parent = 0;
			int child1 = 1;
			int child2 = 2;
			int min = parent;

			while (child1 <= j) {
				if (arr[child1] < arr[min]) {
					min = child1;
				}

				if (child2 <= j && arr[child2] < arr[min]) {
					min = child2;
				}

				if (min == parent) {
					break;
				} else {

					int temp = arr[min];
					arr[min] = arr[parent];
					arr[parent] = temp;

					parent = min;
					child1 = parent * 2 + 1;
					child2 = parent * 2 + 2;
				}
			}

			int ans = arr[0];
			arr[0] = arr[j];
			arr[j] = ans;
			j--;

		}

	}

	public static void inplaceHeapSort(int arr[]) {

		heapify(arr);
		sort(arr);

	}

}

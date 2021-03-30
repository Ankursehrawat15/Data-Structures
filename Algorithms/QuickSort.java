public class Sorting {

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}
		int pivot = arr[hi];

		int pivotIndex = partition(arr, lo, hi, pivot);
		quickSort(arr, lo, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, hi);

	}

	public static int partition(int[] arr, int lo, int hi, int pivot) {
		// 0 to j-1 => <= pivot
		// j to i-1 => > pivot
		int i = lo;
		int j = lo;

		while (i < arr.length) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;

			}
		}

		return j - 1;
	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 8, 5, 1, 3, 7, 9, 6 };
		int lo = 0;
		int hi = arr.length - 1;

		quickSort(arr, lo, hi);

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}

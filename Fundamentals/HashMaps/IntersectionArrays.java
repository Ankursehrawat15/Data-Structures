// Brute force TC ==> O(n^2)	
public static void intersection(int[] arr1, int[] arr2) {

		int[] carr = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			carr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < carr.length; j++) {
				if (arr2[i] == carr[j]) {
					System.out.print(arr2[i] + " ");
					carr[j] = Integer.MIN_VALUE;
					break;

				}
			}

		}

	}

	public static int maxFrequencyNumber(int[] arr) {
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}

			if (count > max) {
				max = count;
				num = arr[i];
			}
		}

		return num;

	}

// Using HashMaps

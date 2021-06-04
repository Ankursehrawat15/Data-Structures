// Brute Force
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] arr = new int[nums1.length];
		int index = 0;
		for (int i = 0; i < nums1.length; i++) {

			for (int j = 0; j < nums2.length; j++) {

				if (nums1[i] == nums2[j]) {
					int count = 0;
					for (int x = j + 1; x < nums2.length; x++) {
						if (nums2[x] > nums2[j]) {
							arr[index] = nums2[x];
							index++;
							count++;
							break;
						}

					}

					if (count == 0) {
						arr[index] = -1;
						index++;
					}

				}

			}

		}

		return arr;

	}

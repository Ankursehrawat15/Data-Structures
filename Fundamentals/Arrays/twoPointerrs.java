// Two pointers approach 
public static boolean twoSum(int [] arr , int x) {
		int i = 0 , j = arr.length-1;
		while(i < j) {
			if(arr[i] + arr[j] > x) {
				j--;
			}else if(arr[i] + arr[j] < x) {
				i++;
			}else {
				return true;
			}
		}
		
		return false;
	}

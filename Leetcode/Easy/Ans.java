public class Ans {
    public static int[] solve(int[] nums) {
        int a, b;
        int cur = 1;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a = nums[i] * nums[i];
            arr[i] = a;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int d1 = arr[i];
            int d2 = arr[i + 1];
            if (d1 > d2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -10, -2, 4, 8, 9, 12 };
        int[] ans = solve(arr);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}

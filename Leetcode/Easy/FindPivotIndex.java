// Leetcode: https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex {
    // best approach :- TimeComplexity - o(2n) and space is O(1)
    public int pivotIndex2(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;

    }

    // Brute Force TimeComplexity is O(N^2)
    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            int left = i - 1;
            int right = i + 1;
            while (left >= 0) {

                leftSum += nums[left];
                --left;
            }

            while (right < nums.length) {
                rightSum += nums[right];
                right++;
            }

            if (leftSum == rightSum) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

    }
}

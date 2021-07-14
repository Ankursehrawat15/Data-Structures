// leetcode: https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

    // Approach 1 :- Time complexity O(2N) and space O(N)
    // use another array for storing nonZeros
    // then copy into main array
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }

    }

    // Approach 2 : TimeComplexity O(N) and SpaceComplexity is O(1)
    // take two pointers
    // one for iterating and another for nonZeros

    public void moveZeroes2(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }

                j++;

            }

        }

    }

    public static void main(String[] args) {

    }
}

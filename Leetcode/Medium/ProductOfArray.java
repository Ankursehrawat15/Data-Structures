// leetcode: https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArray {

    // Time complexity - O(N^2)
    // Space Complexity - O(1)
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int prod = 1;
            for (int j = 0; j < nums.length; j++) {

                if (j == i)
                    continue;

                prod = prod * nums[j];

            }

            ans[i] = prod;
        }

        return ans;
    }

    public static void main(String[] args) {

    }

}

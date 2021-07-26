// Leetcode : https://leetcode.com/problems/reverse-string/

public class ReverseString {
    // Using Iterative Method
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;

        }

    }

    // Using Recursive Methods
    private void reverse(char[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);

    }

    public void reverseString(char[] s) {

        reverse(s, 0, s.length - 1);

    }
}

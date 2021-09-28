// Time complexity is O(NlogN)
import java.util.*;

class Solution {
    public int solve(int[] tasks, int[] people) {
        Arrays.sort(tasks);
        Arrays.sort(people);

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < tasks.length && j < people.length) {
            if (tasks[i] <= people[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }
}

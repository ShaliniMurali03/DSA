package DSA.Day2;
import java.util.Arrays;

public class MinimumDifference{
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        int[] nums = {1};
        int k = 0;
        int minScore = solution.minimumDifference(nums, k);
        System.out.println(minScore);
    }
}

class Solution8 {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int initialScore = nums[n - 1] - nums[0];

        if (initialScore <= 2 * k) {
            return initialScore;
        }

        int minScore = initialScore;
        int potentialMin = nums[0] + k;
        int potentialMax = nums[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int currMax = Math.max(potentialMax, nums[i] + 2 * k);
            int currMin = Math.min(potentialMin, nums[i + 1]);

            minScore = Math.min(minScore, currMax - currMin);
        }

        return minScore;
    }
}

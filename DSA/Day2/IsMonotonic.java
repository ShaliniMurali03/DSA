package DSA.Day2;

public class IsMonotonic{
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        int[] nums = {1, 2, 2, 3};
        boolean isMonotonic = solution.isMonotonic(nums);
        System.out.println(isMonotonic);
    }
}

class Solution7 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && decreasing) {
                increasing = false;
            } else if (nums[i] < nums[i - 1] && increasing) {
                decreasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }
}

package DSA.Day2;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = solution.search(nums, target);
        System.out.println(index);
    }
}

class Solution6 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}

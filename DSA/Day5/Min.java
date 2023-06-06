package DSA.Day5;

public class Min
{
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the right boundary,
            // the minimum element is in the right part of the array.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // If the middle element is less than or equal to the right boundary,
            // the minimum element is in the left part of the array.
            else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        System.out.println(min);
    }
}


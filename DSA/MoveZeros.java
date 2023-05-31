package DSA;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int left = 0; // Left pointer
        int right = 0; // Right pointer

        // Move non-zero elements to the front
        while (left < nums.length) {
            if (nums[left] != 0) {
                swap(nums, left, right);
                right++;
            }
            left++;
        }

        // Set remaining elements to 0
        while (right < nums.length) {
            nums[right] = 0;
            right++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}

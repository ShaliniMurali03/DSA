package DSA;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Represents the count of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is not equal to val
            if (nums[i] != val) {
                // Move the current element to the kth position in the array
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println("Output: " + result + ", nums = " + Arrays.toString(nums));
    }
}

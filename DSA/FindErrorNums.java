package DSA;

import java.util.Arrays;

public class FindErrorNums {

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // Calculate XOR of all numbers in nums and all numbers from 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= nums[i] ^ (i + 1);
        }

        // Get the rightmost set bit in xor
        int rightmostSetBit = xor & (-xor);

        int missing = 0;
        int duplicate = 0;

        // Separate the numbers into two groups based on whether the rightmost set bit is set or not
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                missing ^= num;
            } else {
                duplicate ^= num;
            }
        }

        // Separate the numbers from 1 to n into two groups based on whether the rightmost set bit is set or not
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                missing ^= i;
            } else {
                duplicate ^= i;
            }
        }

        // Check which number is missing and which number is duplicated
        for (int num : nums) {
            if (num == duplicate) {
                return new int[]{duplicate, missing};
            }
        }

        return new int[]{missing, duplicate};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}

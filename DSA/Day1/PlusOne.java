package DSA.Day1;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Add 1 to the current digit
            digits[i]++;

            // If the digit becomes less than 10, there is no carry
            if (digits[i] < 10) {
                return digits;
            }

            // If the digit becomes 10, there is a carry
            // Set the digit to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If we reach this point, it means there is a carry at the most significant digit
        // Create a new array with one additional digit and set it to 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}


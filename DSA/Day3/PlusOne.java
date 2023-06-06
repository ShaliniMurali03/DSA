package DSA.Day3;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Add 1 to the least significant digit
        digits[n - 1] += 1;

        // Carry over any overflow
        int carry = digits[n - 1] / 10;
        digits[n - 1] %= 10;

        // Iterate from right to left and propagate the carry
        for (int i = n - 2; i >= 0; i--) {
            if (carry == 0) {
                break;
            }
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        // If there is still a carry, create a new array with an additional digit
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        PlusOne solution = new PlusOne();
        int[] result = solution.plusOne(digits);

        // Print the resulting array
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}

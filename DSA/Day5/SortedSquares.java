package DSA.Day5;
import java.util.Arrays;

public class SortedSquares
{
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];

        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);

        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squares = sortedSquares(nums);

        // Print the resulting array
        for (int square : squares) {
            System.out.print(square + " ");
        }
    }
}

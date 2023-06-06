package DSA.Day4;
import java.util.Arrays;

public class MatrixTranspose {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        MatrixTranspose solution = new MatrixTranspose();
        int[][] transposedMatrix = solution.transpose(matrix);

        // Print the transposed matrix
        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

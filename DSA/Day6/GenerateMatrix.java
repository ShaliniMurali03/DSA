package DSA.Day6;

public class GenerateMatrix
{
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Start with the number 1
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (num <= n * n) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Traverse from bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


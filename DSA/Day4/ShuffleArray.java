package DSA.Day4;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            result[idx++] = nums[i];
            result[idx++] = nums[n + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        ShuffleArray solution = new ShuffleArray();
        int[] shuffledArray = solution.shuffle(nums, n);

        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}


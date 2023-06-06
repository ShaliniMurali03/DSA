package DSA.Day6;

public class ValidMountainarray
{
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int n = arr.length;

        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        boolean isValidMountain = validMountainArray(arr);
        System.out.println(isValidMountain);
    }
    }

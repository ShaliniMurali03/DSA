package DSA.Day4;

public class CompleteStaircase {
    public int arrangeCoins(int n) {
        int k = 0;
        while (n >= k) {
            n -= k;
            k++;
        }
        return k - 1;
    }

    public static void main(String[] args) {
        int n = 5;

        CompleteStaircase solution = new CompleteStaircase();
        int completeRows = solution.arrangeCoins(n);

        System.out.println(completeRows);
    }
}


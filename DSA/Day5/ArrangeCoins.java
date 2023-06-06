package DSA.Day5;

public class ArrangeCoins
{
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int rowCoins = 1;

        while (n >= rowCoins) {
            n -= rowCoins;
            completeRows++;
            rowCoins++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
    }
}

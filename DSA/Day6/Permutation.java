package DSA.Day6;
import java.util.ArrayList;
import java.util.List;


public class Permutation {
    public static int[] findPermutation(String s) {
        int n = s.length() + 1;
        int[] perm = new int[n];
        List<Integer> available = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            available.add(i);
        }

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = available.remove(index);
            } else {
                perm[i] = available.remove(available.size() - 1);
            }
        }

        perm[n - 1] = available.get(0);

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);

        // Print the resulting permutation
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}

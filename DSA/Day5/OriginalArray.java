package DSA.Day5;
import java.util.HashSet;
import java.util.Set;

public class OriginalArray
{
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // If the length is odd, it can't be a doubled array
        }

        int[] original = new int[changed.length / 2];
        Set<Integer> seen = new HashSet<>();

        for (int num : changed) {
            if (seen.contains(num * 2)) {
                original[seen.size()] = num;
                seen.remove(num * 2);
            } else {
                seen.add(num);
            }
        }

        if (seen.isEmpty()) {
            return original;
        } else {
            return new int[0]; // If there are unmatched elements, it's not a doubled array
        }
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        // Print the resulting array
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}

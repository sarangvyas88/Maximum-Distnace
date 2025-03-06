import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static int maxDiff(ArrayList<Integer> a, int n) {
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (a.get(i) <= a.get(j)) {
                    maxDiff = Math.max(maxDiff, j - i);
                    break; // No need to check further for this i
                }
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 5, 4, 1));
        int n = a.size();
        System.out.println(maxDiff(a, n)); // Output: 2
    }
}
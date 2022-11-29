// Day 75
// https://codeforces.com/problemset/problem/1462/A
// 1462 A. Favourite Sequences

import java.util.*;

public class favouriteSequenceCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            for (int j = 0; j < n / 2; j++) {
                System.out.print(arr[j] + " " + arr[n - j - 1] + " ");
            }
            if (n % 2 != 0)
                System.out.print(arr[n / 2]);
            System.out.println();
        }
        in.close();
    }
}

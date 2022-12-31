// Day 107
// https://codeforces.com/problemset/problem/1554/A
// 1554 A. Cherry

import java.util.*;

public class cherryCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            long max = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(arr[i] * arr[i + 1], max);
            }
            System.out.println(max);
        }
        in.close();
    }
}

// Day 89
// https://codeforces.com/problemset/problem/1511/A
// 1511 A. Review Site

import java.util.*;

public class reviewSiteCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1)
                    count++;
            }
            System.out.println(count);
        }
        in.close();
    }
}

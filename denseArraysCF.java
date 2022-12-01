// Day 76
// https://codeforces.com/problemset/problem/1490/A
// 1490 A. Dense Arrays

import java.util.*;

public class denseArraysCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            for (int i = 0; i < n - 1; i++) {
                int max = Math.max(arr[i], arr[i + 1]);
                int min = Math.min(arr[i], arr[i + 1]);
                if (max > min * 2) {
                    while (min * 2 < max) {
                        min = min * 2;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}

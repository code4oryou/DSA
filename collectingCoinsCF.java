// Day 64
// https://codeforces.com/problemset/problem/1294/A
// 1294 A. Collecting Coins

import java.util.*;

public class collectingCoinsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int max = Integer.MIN_VALUE;
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            if (a >= b && a >= c)
                max = a;
            if (b >= c && b >= a)
                max = b;
            if (c >= a && c >= b)
                max = c;
            int sum = max - a + max - b + max - c;
            if (sum > n) {
                System.out.println("NO");
                continue;
            }
            n = n - sum;
            if (n % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}

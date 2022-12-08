// Day 83
// https://codeforces.com/problemset/problem/598/A
// 598 A. Tricky Sum

import java.util.*;

public class trickySumCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        for (int j = 0; j < t; j++) {
            long n, i, sum = 0;
            n = in.nextInt();
            sum = (n * (n + 1)) / 2;
            for (i = 1; i <= n; i *= 2) {
                sum -= i + i;
            }
            System.out.println(sum);
        }
        in.close();
    }
}

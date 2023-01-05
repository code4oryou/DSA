// Day 112
// https://codeforces.com/problemset/problem/1352/C
// 1352 C. Kth Not Divisible By N

import java.util.*;

public class KthNotDivisibleByNCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            long ans = k + (k - 1) / (n - 1);
            System.out.println(ans);
        }
        in.close();
    }
}

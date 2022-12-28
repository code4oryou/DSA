// Day 103
// https://codeforces.com/contest/1731/problem/B
// 1731 B. Kill Demodogs

import java.util.*;

public class killDemodogsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        while (t-- > 0) {
            long n = in.nextLong();
            long sum = (2022 * ((n * (n * n - 1)) / 3 + (n * (n + 1) * (2 * n + 1)) / 6));
            System.out.println(sum % 1000000007);
        }
        in.close();
    }
}

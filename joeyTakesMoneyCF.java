// Day 103
// https://codeforces.com/contest/1731/problem/A
// 1731 A. Joey Takes Money

import java.util.*;

public class joeyTakesMoneyCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int num[] = new int[n];
            long ans = 1;
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
                ans = ans * num[i];
            }
            ans = ans + n - 1;
            System.out.println((ans * 2022));
        }
        in.close();
    }
}

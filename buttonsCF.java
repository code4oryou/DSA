// Day 82
// https://codeforces.com/problemset/problem/268/B
// 268 B. Buttons

import java.util.*;

public class buttonsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int N = n;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            while (N-- > 1) {
                sum += i;
            }
            N = n - i;
        }
        System.out.println(sum + n);
    }
}

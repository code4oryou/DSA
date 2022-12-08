// Day 83
// https://codeforces.com/problemset/problem/26/A
// 26 A. Almost Prime

import java.util.*;

public class almostPrimeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for (int i = 6; i <= n; i++) {
            int t = i;
            int count = 0;
            for (int j = 2; j * j <= t; j++) {
                if (t % j == 0) {
                    count++;
                    while (t % j == 0)
                        t /= j;
                }
            }
            if (t > 1)
                count++;
            if (count == 2)
                res++;
        }
        System.out.println(res);
        in.close();
    }
}

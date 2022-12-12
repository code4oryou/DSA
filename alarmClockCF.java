// Day 88
// https://codeforces.com/problemset/problem/1354/A
// 1354 A. Alarm Clock

import java.util.*;

public class alarmClockCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (b >= a) {
                System.out.println(b);
            } else if (c <= d) {
                System.out.println(-1);
            } else {
                a -= b;
                long ans = c - d;
                System.out.println(b + ((a + ans - 1) / ans) * c);
            }
        }
        in.close();
    }
}

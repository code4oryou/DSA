// Day 78
// https://codeforces.com/problemset/problem/1521/A
// 1521 A. Nestia and Nearly Good Numbers

import java.util.*;

public class nearlyGoodNumbersCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (b == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(a + " " + (long) a * b + " " + (long) a * (b + 1));
            }
        }
        in.close();
    }
}

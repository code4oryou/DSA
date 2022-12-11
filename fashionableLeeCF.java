// Day 87
// https://codeforces.com/problemset/problem/1369/A
// 1369 A. Fashionablelee

import java.util.*;

public class fashionableLeeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(n % 4 == 0 ? "YES" : "NO");
        }
        in.close();
    }
}

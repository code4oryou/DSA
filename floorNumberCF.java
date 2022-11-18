// Day 64
// https://codeforces.com/problemset/problem/1426/A
// 1426 A. Floor Number

import java.util.*;

public class floorNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();

            System.out.println(Math.max(((n - 2 + x - 1) / x), 0) + 1);
        }

        in.close();
    }
}

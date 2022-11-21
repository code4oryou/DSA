// Day 67
// https://codeforces.com/problemset/problem/1348/A
// 1348 A. Phoenix and Balance

import java.util.*;

public class phoenixAndBalanceCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a = n / 2;
            double temp = Math.pow(2, n);
            for (int i = 1; i < a; i++) {
                temp += Math.pow(2, i);
            }
            double s = 0.0;
            for (int i = a; i < n; i++) {
                s = s + Math.pow(2, i);
            }
            double d = temp - s;
            System.out.println((int) d);
        }
        in.close();
    }
}

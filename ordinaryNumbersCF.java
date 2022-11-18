// Day 64
// https://codeforces.com/problemset/problem/1520/B
// 1520 B. Ordinary Numbers

import java.util.*;

public class ordinaryNumbersCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long temp = 0;
            long count = 0;
            for (int i = 1; i <= 9; i++) {
                temp = i;
                while (temp <= n) {
                    count++;
                    temp = temp * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}

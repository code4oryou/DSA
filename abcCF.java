// Day 107
// https://codeforces.com/problemset/problem/1632/A
// 1632 A. ABC

import java.util.*;

public class abcCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.next();
            if (n > 2 || s.equals("11") || s.equals("00")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();
    }
}

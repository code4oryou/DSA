// Day 75
// https://codeforces.com/problemset/problem/584/A
// 584 A. Olesya and Rodion

import java.util.*;

public class olesyaAndrodionCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        if (n == 1 && t == 10) {
            System.out.println("-1");
        } else if (t == 10) {
            System.out.print(t);
            n -= 2;
            while (n-- > 0) {
                System.out.print(0);
            }
        } else {

            System.out.print(t);
            while (n-- > 1) {
                System.out.print(0);
            }
        }
        in.close();
    }
}

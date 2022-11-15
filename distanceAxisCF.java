// Day 61
// 1401 A. Distance and axis
// https://codeforces.com/problemset/problem/1401/A

import java.util.*;

public class distanceAxisCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A < B) {
                System.out.println(B - A);
            } else if (A % 2 == B % 2) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        in.close();
    }
}

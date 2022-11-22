// Day 68
// https://codeforces.com/problemset/problem/1735/B
// 1735 B. Tea with Tangerines

import java.util.*;

public class teaWithTangerinesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(n / 3 - 2);
        }
        in.close();
    }
}

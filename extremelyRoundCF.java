// Day 88
// https://codeforces.com/contest/1766/problem/0
// 1766 A. Extremely Round

import java.util.*;

public class extremelyRoundCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String s = Integer.toString(n);
            char ch = s.charAt(0);
            int num = (ch - '0');
            int ans = num + (9 * s.length()) - 9;
            System.out.println(ans);
        }
        in.close();
    }
}

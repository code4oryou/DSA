// Day 76
// https://codeforces.com/problemset/problem/1633/A
// 1633 A. Div 7

import java.util.*;

public class div7CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int ans = (n / 7) * 7;
            if (n / 10 != ans / 10)
                ans += 7;
            System.out.println(ans);
        }
        in.close();
    }
}

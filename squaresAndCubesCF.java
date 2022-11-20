// Day 66
// https://codeforces.com/problemset/problem/1619/B
// 1619 B. Sqaure and Cubes

import java.util.*;

public class squaresAndCubesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int ans = (int) Math.sqrt(n) + (int) Math.cbrt(n) - (int) (Math.sqrt(Math.cbrt(n)));
            System.out.println(ans);
        }

        in.close();
    }
}

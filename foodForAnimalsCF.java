// Day 86
// https://codeforces.com/problemset/problem/1675/A
// 1675 A. Food For Animals

import java.util.*;

public class foodForAnimalsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            x -= a;
            y -= b;
            x = Math.max(0, x);
            y = Math.max(0, y);
            if (x + y <= c)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}

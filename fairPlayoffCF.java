
// Day 57
// 1535 A. Fair Playoff
// https://codeforces.com/problemset/problem/1535/A
import java.util.*;

public class fairPlayoffCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int maxx = Math.max(c, d);
            int minn = Math.min(c, d);
            if (max < minn || maxx < min) {
                System.out.println("NO");
            } else
                System.out.println("YES");
        }
        in.close();
    }
}

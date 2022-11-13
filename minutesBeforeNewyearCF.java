
// Day 58
// 1283 A. Minutes before newyear
// https://codeforces.com/problemset/problem/1283/A
import java.util.*;

public class minutesBeforeNewyearCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int h = in.nextInt();
            int m = in.nextInt();
            int ans = (24 - h) * 60 - m;
            System.out.println(ans);
        }
        in.close();
    }
}

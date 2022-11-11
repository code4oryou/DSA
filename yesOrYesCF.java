
// Day 56
// A. Yes or Yes
// https://codeforces.com/problemset/problem/1703/A
import java.util.*;

public class yesOrYesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            s = s.toLowerCase();
            if (s.equals("yes"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}

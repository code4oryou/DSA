
// Day 65
// https://codeforces.com/contest/1759/problem/0
// 1759 A. Yes Yes
import java.util.*;

public class yesYesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            String s = "";
            String h = in.next();
            for (int j = 0; j < 50; j++) {
                s = s + "Yes";
            }
            if (s.indexOf(h) != -1) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        in.close();
    }
}
